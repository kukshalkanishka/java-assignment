package com.step.polymorphism;

import java.util.Scanner;

public class Console implements Displayable{

    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        String userInput = scanner.nextLine();
        System.out.println("User input: "+ userInput);
    }
}
