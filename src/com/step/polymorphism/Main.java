package com.step.polymorphism;

public class Main {
    public static void main(String[] args) {

        Displayable console = new Console();
        Fetchable pdfPage = new PDFPage();
        Displayable webPage = new WebPage();
        Fetchable webPage1 = new WebPage();
        Displayable nonInteractiveWebPage = new NonInteractiveWebPage();
        Fetchable nonInteractiveWebPage1 = new NonInteractiveWebPage();
        console.display();
        System.out.println(pdfPage.fetchContents());
        ((WebPage) webPage).click();
        webPage.display();
        System.out.println(((WebPage) webPage).fetchContents());
        System.out.println(webPage1.fetchContents());
        nonInteractiveWebPage.display();
        System.out.println(nonInteractiveWebPage1.fetchContents());

    }
}
