/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.api.nodes;

import com.northwind.api.model.Customer;
import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public class CustomerNode extends BeanNode<Customer> {
    
    public CustomerNode(Customer bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
    }
    
}
