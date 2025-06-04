package com.example.library;

public class TestAll {
    public static void main(String[] args) {
        Book book = new Book();
        DVD dvd = new DVD();
        Magazine magazine =new Magazine();


        book.Checkout();
        dvd.Checkout();
        magazine.Checkout();
        book.returnItem();
        dvd.returnItem();
        magazine.returnItem();
    }
}
