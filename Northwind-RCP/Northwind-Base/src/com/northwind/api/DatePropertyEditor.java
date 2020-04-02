/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.api;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import org.jdesktop.swingx.JXDatePicker;
import org.openide.explorer.propertysheet.ExPropertyEditor;
import org.openide.explorer.propertysheet.InplaceEditor;
import org.openide.explorer.propertysheet.PropertyEnv;
import org.openide.explorer.propertysheet.PropertyModel;
import org.openide.nodes.PropertyEditorRegistration;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
@PropertyEditorRegistration(targetType = Date.class)
public class DatePropertyEditor extends PropertyEditorSupport 
        implements ExPropertyEditor, InplaceEditor.Factory {
    
    private InplaceEditor ed;

    @Override
    public void attachEnv(PropertyEnv pe) {
        pe.registerInplaceEditorFactory(this);
    }

    @Override
    public InplaceEditor getInplaceEditor() {
        if ( ed == null) {
            ed = new Inplace();
        }
        
        return ed;
    }
    
    @Override
    public String getAsText() {
        Date d = (Date)getValue();
        
        if ( d == null) {
            return "No Date Set";
        }
        
        return new SimpleDateFormat("dd/MM/yy HH:mm:ss").format(d);
    }
    
    @Override
    public void setAsText(String s) {
        try {
            setValue(new SimpleDateFormat("dd/MM/yy HH:mm:ss").parse(s));
        } catch ( ParseException ex ) {
            throw new IllegalArgumentException("Could not parse date");
        }
    }
    
    private static class Inplace implements InplaceEditor {
        
        private final JXDatePicker picker = new JXDatePicker();
        private PropertyEditor editor = null;
        private PropertyModel model;
        
        @Override
        public void connect(PropertyEditor pe, PropertyEnv pe1) {
            editor = pe;
            reset();
        }

        @Override
        public JComponent getComponent() {
            return picker;
        }

        @Override
        public void clear() {
            // avoid memory leaks
            editor = null;
            model = null;
        }

        @Override
        public Object getValue() {
            return picker.getDate();
        }

        @Override
        public void setValue(Object o) {
            picker.setDate((Date)o);
        }

        @Override
        public boolean supportsTextEntry() {
            return true;
        }

        @Override
        public void reset() {
            Date d = (Date) editor.getValue();
            if ( d != null ) {
                picker.setDate(d);
            }
        }

        @Override
        public void addActionListener(ActionListener al) {
            // IGNORE: Unneeded for this editor.
        }

        @Override
        public void removeActionListener(ActionListener al) {
            // IGNORE: Unneeded for this editor.
        }

        @Override
        public KeyStroke[] getKeyStrokes() {
            return new KeyStroke[0];
        }

        @Override
        public PropertyEditor getPropertyEditor() {
            return editor;
        }

        @Override
        public PropertyModel getPropertyModel() {
            return model;
        }

        @Override
        public void setPropertyModel(PropertyModel pm) {
            this.model = pm;
        }

        @Override
        public boolean isKnownComponent(Component cmpnt) {
            return cmpnt == picker || picker.isAncestorOf(cmpnt);
        }
        
    }
    
}
