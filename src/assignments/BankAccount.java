package assignments;

public class BankAccount {
    static double  balance=1000;
    int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        //this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {

    }
    public double deposit(double amount){
        balance+=amount;
        System.out.println(amount+ " is deposited succesful");
        return balance;
    }
    public double withDraw(double amount){
        if(amount>balance){
            System.out.println("Don't have sufficient balance your current balance " + balance);
        }else {
            balance-=amount;
            System.out.println("Current Balance after withdraw " + BankAccount.balance);
        }

        return balance;
    }
    public int userAccountNumber(int accNumber){
        return accNumber;
    }
}
