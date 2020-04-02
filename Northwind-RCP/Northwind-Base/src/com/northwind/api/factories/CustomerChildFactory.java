/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.api.factories;

import com.northwind.api.CustomerManagerInterface;
import com.northwind.api.model.Customer;
import com.northwind.api.nodes.CustomerNode;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public class CustomerChildFactory extends ChildFactory<Customer> {
    
    @Override
    protected boolean createKeys(List<Customer> list) {
        
        final CustomerManagerInterface mgr = 
                Lookup.getDefault().lookup(CustomerManagerInterface.class);
        
        return true;
        
    }
    
    protected Node createNodeForKey(final Customer key) {
        CustomerNode node = null;
        
        try {
            node = new CustomerNode(key);
        } catch ( IntrospectionException ex ) {
            Exceptions.printStackTrace(ex);
        }
        
        return node;
    }
    
}
