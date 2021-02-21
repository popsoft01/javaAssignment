

import java.util.Scanner;

public class QuadriticEquation {
    public static void main(String... args){
        double A;
        double B;
        double C;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first variable :");
        A = input.nextDouble();

        System.out.print("Enter the second variable :");
        B = input.nextDouble();

        System.out.print("Enter the second variable :");
        C = input.nextDouble();

        System.out.println("starting the calculation :");
        double D = (Math.sqrt(Math.pow(B, 2 ))- (4 * A * C));

        double X = (-B + D)/(2 * A);

        double Y = (-B - D)/(2 * A);


        System.out.println("The variable is :  " +  D   +  " The Variable X : "+ X + " The Variable Y : " + Y);
    }
}
