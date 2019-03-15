package com.step.library_assignment;

import java.util.*;

public class Library {

    private Set<Book> removedBooks = new HashSet<>();
    private Set<Book> books = new HashSet<>();
    private Map<Book, Reader> bookRegister = new HashMap<>();
    private String librarian;

    public Library(String librarian) {
        this.librarian = librarian;
    }

    public boolean searchBook(String bookName) {
        return this.getBook(bookName) != null;
    }

    Book getBook(String bookName) {
        for (Book book : this.books) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String bookName, Reader reader) {
        Book book = this.getBook(bookName);

        if (this.searchBook(bookName) && !book.getBorrowedStatus()) {
            book.setHasBorrowed();
            reader.borrowBook(book);
            this.bookRegister.put(book, reader);
        }
    }

    public void addBook(Book book, String librarian) {
        if (librarian.equals(this.librarian)) {
            this.books.add(book);
        }
    }

    public Set<Book> getAvailableBooks() {
        return Collections.unmodifiableSet(this.books);
    }

    public void removeBook(String bookName, String librarian) {
        if (librarian.equals(this.librarian)) {
            Book book = this.getBook(bookName);
            this.books.remove(book);
            this.removedBooks.add(book);
        }
    }

    public void returnBook(Book book, Reader reader) {
        this.bookRegister.remove(book);
        reader.returnBook(book);
        if (this.books.contains(book)) {
            book.resetHasBorrowed();
        }
    }

    public Reader getBorrowerOfBook(String bookName, String librarian) {
        if (librarian.equals(this.librarian) && this.searchBook(bookName)) {
            Book book = this.getBook(bookName);
            return this.bookRegister.get(book);
        }
        return null;
    }


    public boolean isBookRemoved(String bookName) {
        for (Book book : removedBooks) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public Set<Book> getBooksBorrowedBy(Reader reader, String librarian) {
        if (librarian.equals(this.librarian)) {
            return reader.getBorrowedBooks();
        }
        return null;
    }

    Map<Book, Reader> getBookRegister() {
        return Collections.unmodifiableMap(this.bookRegister);
    }


}
