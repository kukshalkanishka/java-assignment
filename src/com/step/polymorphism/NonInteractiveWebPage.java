package com.step.polymorphism;

public class NonInteractiveWebPage implements Fetchable, Displayable{
    private String content = "Welcome to non interactive web page";

    @Override
    public String fetchContents() {
        return content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}
