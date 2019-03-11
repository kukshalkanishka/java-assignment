package com.step.polymorphism;

public class WebPage implements Displayable, Fetchable{

    private String content = "Welcome to the Web page";

    @Override
    public void display() {
        System.out.println(this.content);
    }

    public void click(){
        System.out.println("You clicked on the web page");
    }

    @Override
    public String fetchContents() {
        return content;
    }
}
