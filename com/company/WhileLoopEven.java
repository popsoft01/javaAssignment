package com.company;

public class WhileLoopEven {
    public static void  main(String... args){
        int number = 0;
        while (number < 100){
            if (number % 2 == 0)
                number += 2;
            System.out.println(number);
        }
    }
}
