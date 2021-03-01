package com.company;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String... args){
        double  radius;
        double  area;
        double length;
        double volume;
        double pi = Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length");
        length = input.nextDouble();

        System.out.println("Enter the radius");
        radius = input.nextDouble();

        area =  radius * radius * pi;
        System.out.println("The area of the cylinder is: " + area);

        volume = area * length;
        System.out.println("The volume of cylinder is: " + volume);

    }
}
