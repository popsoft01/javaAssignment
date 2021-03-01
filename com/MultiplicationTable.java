package com;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("      Multiplication Table");

        System.out.println(" ");
        for (int up = 1; up<=9; up++) {
            if(up == 1){
                System.out.print("\t");
            }
            System.out.print("    " + up);
            if(up == 9){
                System.out.println();
            }
        }

        for (int j = 1; j <= 9; j++){
            System.out.print(j + " | ");
            for (int up = 1; up<=9; up++){
                System.out.printf("%4d", up * j);
            }
            System.out.println();
        }
    }
}
