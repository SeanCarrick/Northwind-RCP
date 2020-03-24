/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.northwind.accounting.controller;

import com.pekinsoft.northwind.accounting.view.GLTopComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "View",
        id = "com.pekinsoft.northwind.accounting.controller.GLViewAction"
)
@ActionRegistration(
        iconBase = "com/pekinsoft/northwind/accounting/controller/Script.png",
        displayName = "#CTL_GLViewAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/View", position = 0, separatorAfter = 50),
    @ActionReference(path = "Toolbars/Memory", position = 0),
    @ActionReference(path = "Shortcuts", name = "DO-G")
})
@Messages("CTL_GLViewAction=General Ledger...")
public final class GLViewAction implements ActionListener {
    private final String className = GLViewAction.class.getName();
    private final Logger log = Logger.getLogger(className);
    private String method;
    private LogRecord record;

    @Override
    public void actionPerformed(ActionEvent e) {
        record = new LogRecord(Level.INFO, "Entering actionPerformed()");
        record.setSourceClassName(className);
        record.setSourceMethodName("actionPerformed");
        log.log(record);
        
        record.setMessage("Creating the General Ledger window...");
        log.log(record);
        GLTopComponent gl = new GLTopComponent();
        
        record.setMessage("Showing the General Ledger window...");
        log.log(record);
        gl.open();
        
        record.setMessage("Exiting " + record.getSourceMethodName());
    }
}
