package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        System.out.println(" A book with ISBN " + isbn + " was not found.");
    }
}
