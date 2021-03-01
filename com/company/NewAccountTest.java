package com.company;

import java.util.Scanner;

public class NewAccountTest {
    public static void main(String... args){
        NewAccount Account = new NewAccount("Chibuzor Ezemi", 500.00);
        System.out.printf("%s balance: $%.2f%n%n",
                Account.getName(), Account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print(Account.getName() + Account.getBalance());

        System.out.print("Your new Account balance is : " + Account.getBalance());

        System.out.println("Enter the deposit Amount");
        double depositAmount = input.nextDouble();

        System.out.println("Your new Account balance is: " + Account.getBalance());
    }
}
