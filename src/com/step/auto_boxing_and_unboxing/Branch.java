package com.step.auto_boxing_and_unboxing;

import java.util.ArrayList;
import java.util.Collection;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addTransaction(Customer customer, Double transaction) {
        customer.addTransaction(transaction);
    }


    public String getName() {
        return this.name;
    }

    public Customer getCustomerName(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void displayCustomerNameList() {
        for ( Customer customer : this.customers) {
            System.out.println("Name : " + customer.getName());
        }
    }
}
