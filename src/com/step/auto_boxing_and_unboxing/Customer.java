package com.step.auto_boxing_and_unboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, Double initialTransactionAmount) {
        this.name = name;
        this.transactions.add(initialTransactionAmount);
    }

    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return this.name;
    }
}
