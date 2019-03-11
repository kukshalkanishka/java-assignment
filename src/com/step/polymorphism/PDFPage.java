package com.step.polymorphism;

public class PDFPage implements Fetchable{

    private String content = "This is PDF page contents";
    @Override
    public String fetchContents() {
        return content;
    }
}
