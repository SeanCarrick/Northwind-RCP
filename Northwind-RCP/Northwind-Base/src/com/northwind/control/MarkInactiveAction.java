/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.control;

import com.northwind.api.CustomerManagerInterface;
import com.northwind.api.model.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "com.northwind.control.MarkInactiveAction"
)
@ActionRegistration(
        iconBase = "com/northwind/icons/mt_checkbox.png",
        displayName = "#CTL_MarkInactiveAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 639, separatorAfter = 682),
    @ActionReference(path = "Toolbars/UndoRedo", position = 750)
})
@Messages("CTL_MarkInactiveAction=Mark Customer as Inactive")
public final class MarkInactiveAction implements ActionListener {

    private final List<Customer> context;
    private final CustomerManagerInterface customerMgr;

    public MarkInactiveAction(List<Customer> context) {
        this.context = context;
        customerMgr = Lookup.getDefault().lookup(CustomerManagerInterface.class);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for ( Customer c : context ) {
            customerMgr.markAsInactive(c.getId(), false);
        }
    }
}
