package com.company;

public class QuadraticEquation1 {
    double A;
    double B;
    double C;
    double square;
    public QuadraticEquation1(double A,double B,double C){
        this.A = A;
        this.B = B;
        this.C = C;
        square = (Math.sqrt(Math.pow(B, 2)) - (4 * A *C));
    }
    public double getSolution(){
        return ((-B-square)/(2 * A));
    }
    public double getSolution1(){
        return ((-B+square)/(2 * A));
    }
}
