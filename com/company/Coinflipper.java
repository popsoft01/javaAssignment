package com.company;

public class Coinflipper {
    public static void main(String... args){
        if(Math.random() < 0.5)
            System.out.println("head");
        else
            System.out.println("tail");
    }
}
