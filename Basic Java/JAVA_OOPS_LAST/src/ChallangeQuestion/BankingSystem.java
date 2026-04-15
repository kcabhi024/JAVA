package ChallangeQuestion;


interface Loanable{

    double applyLoan(double amount);

}

abstract class Account{

     long accoutnNumber;
     double balance = 1000;

    abstract double Withdraw(double amount);

    public double Deposite(double amount){
        System.out.println("Deposited Sucessfully");
        return balance+=amount;
    }
}

class SavingAccount extends  Account implements Loanable{

    @Override
    double Withdraw(double amount) {
        if(balance>=amount){
            balance -=amount;
            System.out.println("Withdrawn Amount from saving account is : " + amount);
        }
        else {
            System.out.println("Insufficent Amount");
        }

        return balance;
    }

    @Override
    public double applyLoan(double amount) {
        System.out.println("loan granted" + amount);
        return balance+=amount;
    }
}

class CurrentAccount extends Account{

    @Override
    double Withdraw(double amount) {
        System.out.println(" Amount Withdrawn From Current Account is " + amount);
        return balance-=amount;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Loanable saving = new SavingAccount();
        Account account = new CurrentAccount();


        saving.applyLoan(1000);


        account.Deposite(2000);

        account.Withdraw(200);


      SavingAccount account1 = new SavingAccount();
      account1.Deposite(2000);
        account1.Withdraw(300);




    }
}
