package PersionerClass;

import java.util.Scanner;

public class LoopInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        double rate = 0;
        double principal = 0;
        System.out.println("please enter the interest rate in double: ");
        rate = input.nextDouble();
        System.out.println("Enter the pricinpal Amount: ");
        principal = input.nextDouble();

        for(int year= 1; year <=10; year++){
            amount = principal* Math.pow(1.0 * rate, year);
            System.out.println("the amount every year is: " + amount);
        }
    }
}
