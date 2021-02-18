
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner collector = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int Result;
        int mult;

        System.out.println("Enter the first number");
        firstNumber = collector.nextInt();

        System.out.println("Enter the SecondNumber");
        secondNumber = collector.nextInt();

        Result = firstNumber + secondNumber;
        mult = firstNumber * secondNumber;

        System.out.println("the result is:" + Result);
        System.out.println("the result i: " + mult);

    }
}
