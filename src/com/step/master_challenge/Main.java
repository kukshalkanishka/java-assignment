package com.step.master_challenge;

public class Main {
    public static void main(String[] args) {

    Hamburger hamburger = new Hamburger(new AdditionalItem("plain", 30));
    hamburger.addItem1(new AdditionalItem("Tomato", 3));
    hamburger.addItem2(new AdditionalItem("Onion", 5));
    hamburger.addItem3(new AdditionalItem("Cheese", 5));
        System.out.println(hamburger.getCost());
    }


}
