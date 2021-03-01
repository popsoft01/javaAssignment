package com;

import java.util.Scanner;

public class MAxValue {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number, max;
            System.out.println("enter the number");
            number = input.nextInt();
            max = number;
            while (number != 0) {
                System.out.println("enter the you max value");
                number = input.nextInt();
                if (number > max)
                    max = number;
            }
            System.out.println("max is " + max);
            System.out.println("number " + number);
        }
    }

