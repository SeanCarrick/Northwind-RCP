/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.control;

import com.northwind.view.CustomerEntryDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Maintain",
        id = "com.northwind.control.CustomerEntryAction"
)
@ActionRegistration(
        iconBase = "com/northwind/icons/users.png",
        displayName = "#CTL_CustomerEntryAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Maintain", position = 3333),
    @ActionReference(path = "Toolbars/Maintain", position = 3333),
    @ActionReference(path = "Shortcuts", name = "F4")
})
@Messages("CTL_CustomerEntryAction=Enter New Customer")
public final class CustomerEntryAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CustomerEntryDialog dlg = new CustomerEntryDialog(null, true);
        dlg.pack();
        dlg.setVisible(true);
    }
}
