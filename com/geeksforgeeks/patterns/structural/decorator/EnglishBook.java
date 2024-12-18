package com.geeksforgeeks.patterns.structural.decorator;

public class EnglishBook extends BookDecorator{
    public EnglishBook(Book book) {
        super(book);
    }
    @Override
    public String getDescription() {
        return book.getDescription()+" and English book";
    }

    @Override
    public double getPrice() {
        return book.getPrice()+200.00;
    }
}
