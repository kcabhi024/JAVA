package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

//import com.example.geometry.*;  // we can also do that

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(12);
        Rectangle rect =new Rectangle(5,8);



        double cirArea = Math.round(Math.PI*Math.pow(cir.radius,2));
        double rectArea = (rect.length * rect.breadth);

        System.out.println(cirArea);
        System.out.println(rectArea);
    }
}
