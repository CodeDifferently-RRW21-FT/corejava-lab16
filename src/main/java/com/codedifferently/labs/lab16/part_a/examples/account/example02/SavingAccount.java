package com.codedifferently.labs.lab16.part_a.examples.account.example02;

public class SavingAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int x){
        balance += x;
    }

    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
}
