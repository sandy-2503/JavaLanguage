package com.geeksforgeeks.patterns.structural.decorator;

abstract public class BookDecorator implements Book{
    protected Book book;

    public BookDecorator(Book book){
        this.book = book;
    }

    @Override
    public String getDescription() {

        return book.getDescription();
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }
}
