package com.step.polymorphism;

public class WebPage implements Displayable, Fetchable{

    private String webContent = "Welcome to the Web page";

    @Override
    public void display(String content) {
        System.out.println(content);
    }

    public void click(){
        System.out.println("You clicked on the web page");
    }

    @Override
    public String fetchContents() {
        return webContent;
    }
}
