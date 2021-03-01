package ChapterFour;

import java.util.Scanner;

public class GeussGame2 {
    public static void main(String[] args) {


        int guessNumber = 0;
        int number = 15;
        Scanner input = new Scanner(System.in);


        while (guessNumber != number) {
            System.out.println("Please Enter a number");
            guessNumber = input.nextInt();
            {
                if (guessNumber == number)
                    System.out.println("Congratulation you won");
               else if (guessNumber > number)
                    System.out.println("the number is greater");
                else
                    System.out.println("your number is too low");

            }

        }
    }



}