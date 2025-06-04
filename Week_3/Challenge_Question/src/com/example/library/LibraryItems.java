package com.example.library;

import java.security.PublicKey;

public class LibraryItems {

    private  String itemID;
    private  String title;
    private String author;



    public  void  Checkout(){
        System.out.println("Checkout");
    }
    public  void  returnItem(){
        System.out.println("return items");
    }
}
