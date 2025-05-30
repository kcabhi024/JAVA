package com.example.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001" ,"abhi");

        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-400);
        account.withdrawMoney(-300);
    }
}
