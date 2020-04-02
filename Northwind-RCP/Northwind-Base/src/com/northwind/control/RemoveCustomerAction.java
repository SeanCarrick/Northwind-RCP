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
import javax.swing.JOptionPane;
import org.openide.loaders.DataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "com.northwind.control.RemoveCustomerAction"
)
@ActionRegistration(
        iconBase = "com/northwind/icons/Erase.png",
        displayName = "#CTL_RemoveCustomerAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 726),
    @ActionReference(path = "Toolbars/UndoRedo", position = 800)
})
@Messages("CTL_RemoveCustomerAction=Remove Customer")
public final class RemoveCustomerAction implements ActionListener {

    private final List<Customer> context;
    private final CustomerManagerInterface customerMgr;

    public RemoveCustomerAction(List<Customer> context) {
        this.context = context;
        this.customerMgr = Lookup.getDefault().lookup(
                CustomerManagerInterface.class);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        for ( Customer cust : context ) {
            int response = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to remove customer\n" 
                            + cust.getCompanyName() 
                            + " [ID: " + cust.getId() + "] of " 
                            + cust.getCity() + ", " + cust.getState(), 
                    "Remove Customer", JOptionPane.YES_NO_OPTION);
            
            if ( response == JOptionPane.YES_OPTION ) {
                customerMgr.removeCustomer(cust.getId());
            }
        }
    }
}
