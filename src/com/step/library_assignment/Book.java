package com.step.library_assignment;

public class Book {
    private String name;
    private String bookContent;
    private boolean isBorrowed;

    public Book(String name, String bookContent) {
        this.name = name;
        this.bookContent = bookContent;
        isBorrowed = false;
    }

    public String getName() {
        return this.name;
    }

    public void setHasBorrowed(){
        this.isBorrowed = true;
    }

    public void resetHasBorrowed(){
        this.isBorrowed = false;
    }

    public boolean getBorrowedStatus() {
        return isBorrowed;
    }
}
