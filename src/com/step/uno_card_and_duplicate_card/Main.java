package com.step.uno_card_and_duplicate_card;

public class Main {
    public static void main(String[] args) {
        DuplicateUnoCard duplicate = new UnoCard("*", "blue").duplicate();
        System.out.println(duplicate);
    }
}
