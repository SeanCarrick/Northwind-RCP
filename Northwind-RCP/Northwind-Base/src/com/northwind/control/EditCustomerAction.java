/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.control;

import com.northwind.api.model.Customer;
import com.northwind.view.CustomerEntryDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "com.northwind.control.EditCustomerAction"
)
@ActionRegistration(
        iconBase = "com/northwind/icons/editUsers.png",
        displayName = "#CTL_EditCustomerAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 552, separatorBefore = 378),
    @ActionReference(path = "Toolbars/UndoRedo", position = 700)
})
@Messages("CTL_EditCustomerAction=Edit Selected Customer...")
public final class EditCustomerAction implements ActionListener {

    private final Customer context;

    public EditCustomerAction(Customer context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        CustomerEntryDialog dlg = new CustomerEntryDialog(null, true, context);
        dlg.pack();
        dlg.setVisible(true);
    }
}
