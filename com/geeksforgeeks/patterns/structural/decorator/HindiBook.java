package com.geeksforgeeks.patterns.structural.decorator;

public class HindiBook extends BookDecorator{
    public HindiBook(Book book) {
        super(book);
    }
    @Override
    public String getDescription() {
        return book.getDescription()+" and Hindi book";
    }

    @Override
    public double getPrice() {
        return book.getPrice()+150.00;
    }
}
