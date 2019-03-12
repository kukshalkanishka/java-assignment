package com.step.polymorphism;

import java.util.Scanner;

public class Console implements Displayable{
    @Override
    public void display(String userInput) {
        System.out.println("User input: "+ userInput);
    }
}
