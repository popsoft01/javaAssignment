package com.company;

public class NewAccount {
    private String name;
    private double balance;
    public NewAccount(String name, double balance){
        this.name = name;

        if(balance > 0)
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public  void deposit(double depositAmount){
        if (depositAmount > 0.0)
        balance = balance + depositAmount;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}
