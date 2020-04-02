/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.northwind.api.mgrs;

import com.northwind.api.CustomerManagerInterface;
import com.northwind.api.exceptions.ValidationException;
import com.northwind.api.model.Customer;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 */
@ServiceProvider(service = CustomerManagerInterface.class)
public class CustomerManager implements CustomerManagerInterface {
    
    private final List<Customer> records = new ArrayList<>();
    
    {
        Customer test = new Customer();
        test.setActive(true);
        test.setCity("Pekin");
        test.setCompanyName("PekinSOFT Systems");
        test.setContactName("Sean Carrick");
        test.setEmailAddress("sean@pekinsoft.com");
        test.setFaxNumber("");
        test.setNotes("Creaters, designers, and developers of Northwind Traders"
                + " Complete Accounting for Truckers.");
        test.setPhoneNumber("(309) 989-0672");
        test.setState("IL");
        test.setStreetAddress("PO Box 296");
        test.setSuiteNumber("");
        test.setZipCode("61554-0296");
        records.add(test);
        
        test = new Customer("FerroImpex, Inc.", "12582 Avenue de Rivoli", "", 
                "Montreal", "QC", "H4J 2L9", "(514) 982-6868", "", "", "", 
                "Steel distributor", false);
        records.add(test);
    }
    
    public CustomerManager() {
        
        Customer test = new Customer();
        test.setActive(true);
        test.setCity("Pekin");
        test.setCompanyName("PekinSOFT Systems");
        test.setContactName("Sean Carrick");
        test.setEmailAddress("sean@pekinsoft.com");
        test.setFaxNumber("");
        test.setNotes("Creaters, designers, and developers of Northwind Traders"
                + " Complete Accounting for Truckers.");
        test.setPhoneNumber("(309) 989-0672");
        test.setState("IL");
        test.setStreetAddress("PO Box 296");
        test.setSuiteNumber("");
        test.setZipCode("61554-0296");
        records.add(test);
        
        test = new Customer("FerroImpex, Inc.", "12582 Avenue de Rivoli", "", 
                "Montreal", "QC", "H4J 2L9", "(514) 982-6868", "", "", "", 
                "Steel distributor", false);
        records.add(test);
        
    }

    @Override
    public boolean listIsValid() {
        return records.size() > 0;
    }

    @Override
    public void addCustomer(Customer customer) throws ValidationException {
        validate(customer);
        records.add(customer);
    }

    @Override
    public void updateCustomer(Customer customer) throws ValidationException {
        validate(customer);
        
        Customer oldCustomer = findCustomer(customer.getId());
        records.set(records.indexOf(oldCustomer), customer);
    }

    @Override
    public void removeCustomer(long id) {
        records.remove(id);
    }
    
    @Override
    public void markAsInactive(final int id, final boolean active) {
        Customer c = findCustomer(id);
        c.setActive(active);
    }

    @Override
    public List<Customer> listAllCustomers(boolean alphaByCompanyName) {
        
        if ( records.size() > 0 ) {
            final Collator sorter = Collator.getInstance(Locale.US);

            if ( alphaByCompanyName ) {
                Collections.sort(records, new Comparator<Customer>() {
                    @Override
                    public int compare(Customer c1, Customer c2) {
                        return sorter.compare(c1.getCompanyName(), 
                                c2.getCompanyName());
                    }
                });
            } else {
                Collections.sort(records, new Comparator<Customer>() {
                    @Override
                    public int compare(Customer c1, Customer c2) {
                        return sorter.compare(c1.getState(), c2.getState());
                    }
                });
            }
        }
        
        return records;
        
    }

    @Override
    public List<Customer> listActive(boolean isActive) {
        final List<Customer> activeCustomers = new ArrayList<>(records.size());
        
        for ( Customer customer : records ) {
            if ( customer.isActive() ) {
                activeCustomers.add(customer);
            }
        }
        
        return activeCustomers;
    }
    
    private Customer findCustomer(final long id) {
        for ( Customer customer : records ) {
            if ( id == customer.getId() ) {
                return customer;
            }
        }
        
        return null;
    }
    
    private void validate(final Customer customer) throws ValidationException {
        
        if ( customer == null ) {
            throw new NullPointerException("Customer object is null");
        } else if ( customer.getCity().isEmpty() ) {
            throw new ValidationException("City is required, but not provided "
                    + "for Customer ID " + customer.getId());
        } else if ( customer.getCompanyName().isEmpty() ) {
            throw new ValidationException("Company name is required, but not "
                    + "provided for Customer ID " + customer.getId());
        } else if ( customer.getState().isEmpty() ) {
            throw new ValidationException("State or Province is required, but "
                    + "not provided for Customer ID " + customer.getId());
        } else if ( customer.getStreetAddress().isEmpty() ) {
            throw new ValidationException("Street Address is required, but not"
                    + " provided for Customer ID " + customer.getId());
        } else if ( customer.getZipCode().isEmpty() ) {
            throw new ValidationException("Postal Code is required, but not "
                    + "provided for Customer ID " + customer.getId());
        }
        
    }
    
}
