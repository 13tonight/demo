package assignments;

import java.sql.SQLOutput;

public class BankAccount {
    static double  balance = 1000;
    static int accountNumber= 1671453837;

//    public BankAccount(double balance, int accountNumber) {
//        //this.balance = balance;
//        this.accountNumber = accountNumber;
//    }

    public BankAccount() {

    }
    public double deposit(double amount){
        balance+=amount;
        System.out.println(amount+ " is deposited successful");
        System.out.println("Current Balance after deposit " + BankAccount.balance + " in your account Account Number: "+ accountNumber);
        return balance;
    }
    public double withDraw(double amount){
        if(amount>balance){
            System.out.println("Don't have sufficient balance your current balance " + balance);
        }else {
            balance-=amount;
            System.out.println("Current Balance after withdraw " + BankAccount.balance+ " in your account Account Number: "+ accountNumber);
        }

        return balance;
    }
    public double checkBalance(){
        System.out.println("you have "+balance+ " in your account Account Number: "+ accountNumber);
        return balance;
    }
//    public int userAccountNumber(int accNumber){
//        return accNumber;
//    }
}
