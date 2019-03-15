package com.step.library_assignment;

import java.util.*;

public class Reader {
    private String name;
    private Set<Book> borrowedBooks = new HashSet<>();

    public Reader(String name) {
        this.name = name;
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    public Set<Book> getBorrowedBooks(){
        return Collections.unmodifiableSet(this.borrowedBooks);
    }

    public boolean hasBorrowed(Book book){
        return this.borrowedBooks.contains(book);
    }

    public String getName() {
        return name;
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}
