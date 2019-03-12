package com.step.polymorphism;

public class NonInteractiveWebPage implements Fetchable, Displayable{
    private String webContent = "Welcome to non interactive web page";

    @Override
    public String fetchContents() {
        return webContent;
    }

    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
