package com.step.auto_boxing_and_unboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch){
        this.branches.add(branch);
    }

    private Branch getBranch(String name) {
        for (Branch branch: this.branches) {
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    private Customer getCustomer(String name, Branch branch){
        return branch.getCustomerName(name);
    }

    public void addTransaction(Customer customer, Double transaction){
        customer.addTransaction(transaction);
    }

    public boolean doesCustomerExists(Customer customer, Branch branch){
        return branch.getCustomers().contains(customer);
    }

    public void addCustomer(Customer customer, String branchName){
        Branch branch1 = this.getBranch(branchName);
        String message = "Branch with name: "+ branchName + " does not exists";
        if(branch1 != null){
            branch1.addCustomer(customer);
            message = "Successfully added customer to the branch " + branchName;
        }
        System.out.println(message);
    }

}
