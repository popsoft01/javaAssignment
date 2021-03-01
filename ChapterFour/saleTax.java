package ChapterFour;

import java.util.Scanner;

public class saleTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter puschase amount");
        int amount = input.nextInt();
        double tax = amount * 0.06;
        System.out.println("the sale Ta is " + tax);
    }
}
