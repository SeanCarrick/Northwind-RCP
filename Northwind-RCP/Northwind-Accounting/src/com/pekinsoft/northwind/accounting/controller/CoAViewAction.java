/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.northwind.accounting.controller;

import com.pekinsoft.northwind.accounting.view.CoATopComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Window",
        id = "com.pekinsoft.northwind.accounting.controller.CoAViewAction"
)
@ActionRegistration(
        iconBase = "com/pekinsoft/northwind/accounting/controller/Clipboard.png",
        displayName = "#CTL_CoAViewAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Window/Optional Tools", position = 10),
    @ActionReference(path = "Shortcuts", name = "WINDOWS F5")
})
@Messages("CTL_CoAViewAction=Chart of Accounts")
public final class CoAViewAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // Create and show the Chart of Accounts viewer
        CoATopComponent coa = new CoATopComponent();
        coa.open();
    }
}
