package com.example.Bank;

public class BankAccount {

    private String accNumber;
    private  String accName;
    private  double balance;

    public BankAccount(String accNumber, String accName) {
        this.accNumber = accNumber;
        this.accName = accName;
    }

    public  void  depositMoney(double money){
        if(money <=0){
            System.out.println("invalid deposit");
        }
        else {
            balance += money;
        }
    }
    public double withdrawMoney(double money){

        if (money<=0){
            System.out.println("invalid withdraw");
        }
        else if(balance>money){

            balance-=money;
        }
        else {
            money =balance;
            balance =0;
        }
        return money;
    }
}
