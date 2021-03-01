package com.company;

public class EmployeeSalary {

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (amountPerHour < 0){
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        return weeklyPaycheck * 52;
    }
    public static void main(String... args){
        double salary = salaryCalculator(40, 15);
        System.out.println(salary);
    }
}
