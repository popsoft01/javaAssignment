package com;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number = (int) (Math.random() * 10);

        System.out.println("The sum of " + number +" and "+ number1 +" is =" );
        int answer = input.nextInt();

        while (number + number1 != answer){
            System.out.println("wrong answer try again");
            answer = input.nextInt();
        }
        System.out.println("congrats!! you made it:");

    }
}
