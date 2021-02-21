
import java.util.Scanner;

public class QuadriticEquationTest {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Coefficient : ");
        double A = input.nextDouble();

        System.out.println("Enter the second Coefficient : ");
        double B = input.nextDouble();

        System.out.println("Enter the third Coefficient : ");
        double C = input.nextDouble();

        QuadraticEquation1 equation = new QuadraticEquation1(0,0,0);

        System.out.println("The first equation is : " + equation.getSolution() );

        System.out.println("The first equation is : " + equation.getSolution1() );
    }
}
