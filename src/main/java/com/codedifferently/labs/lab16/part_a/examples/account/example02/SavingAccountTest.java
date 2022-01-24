package com.codedifferently.labs.lab16.part_a.examples.account.example02;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount sa0001 = new SavingAccount();
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        sa0001.deposit(1000);

        SavingAccount sa0002 = new SavingAccount();
        sa0002.balance = 2000;
        sa0002.name = "Hakim";
        sa0002.interestRate = 0.02;

    }
}
