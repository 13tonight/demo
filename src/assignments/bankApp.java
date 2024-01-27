package assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bankApp {
    public static void main(String[] args){
        BankAccount banConst= new BankAccount();
        Scanner sc= new Scanner(System.in);
        //int acNumber=sc.nextInt();
        int choice=0;
        do {
            System.out.println("===========================================================================exiawer ee");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            do{
                choice= sc.nextInt();
                if(choice>4){
                    System.out.println("you Entered the wrong input !!!!! please select the correct option");
                }
            }while (choice>5);
            switch (choice){
                case 1:
                    System.out.println("please enter the amount: ");
                    double amount= sc.nextDouble();
                    banConst.deposit(amount);
                    break;
                case 2:
                    System.out.println("How much amount you need to withdraw: ");
                    amount= sc.nextDouble();
                    banConst.withDraw(amount);

                    break;
                case 3:
                    banConst.checkBalance();
                    break;

            }

        }while (choice<4);
    }
}
