
import java.util.Scanner;

public class TemperatureCoverter {
    public static void main(String... args){
        double celsius;
        double fehrenheit;
        Scanner temperature = new Scanner(System.in);

        System.out.println("Enter your temperature in celsius: ");
        celsius = temperature.nextDouble();

        System.out.println("Calculating te fehrenheit");
        fehrenheit = (9/5) * celsius + 32;

        System.out.printf("The result is of fehrenheit is: %s%n ", fehrenheit);


    }
}
