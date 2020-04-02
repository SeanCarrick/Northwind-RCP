/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.api;

import com.northwind.api.exceptions.ValidationException;
import com.northwind.api.model.Customer;
import java.util.List;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
public interface CustomerManagerInterface {
    
    void addCustomer(Customer customer) throws ValidationException;
    void updateCustomer(final Customer customer) throws ValidationException;
    void removeCustomer(final long id);
    void markAsInactive(final int id, final boolean active);
    List<Customer> listAllCustomers(boolean alphaByCompanyName);
    List<Customer> listActive(boolean isActive);
    boolean listIsValid();
    
}
