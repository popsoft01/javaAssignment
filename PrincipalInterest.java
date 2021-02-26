package ChapterFour;

import java.util.Scanner;

public class PrincipalInterest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amount;

        System.out.println("Enter the amount");
        double principal = keyboard.nextDouble();
        double rate = 0.05;

        for(int year = 1; year <= 10; ++year){
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year , amount);
        }
    }
}
