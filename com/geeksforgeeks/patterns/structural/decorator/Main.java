package com.geeksforgeeks.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Book book = new CommonBook();
        EnglishBook engBook = new EnglishBook(book);
        HindiBook hindiBook = new HindiBook(engBook);
        System.out.println(hindiBook.getDescription()+", "+hindiBook.getPrice());
    }
}
