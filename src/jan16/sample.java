package jan16;

import java.util.Scanner;

public class sample {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Welcome to the Lottery! You have 3 change to win 100 Millions");
        for(int i = 0; i < 3 ; i++ ){
            System.out.print("Enter the number: ");
            int number=sc.nextInt();
            if(number % 7 ==0 ){
                System.out.println("you won 7 points");
            } else if (number % 5==0) {
                System.out.println("you won 5 points");
            }else if(number == 6){
                System.out.println("Hurray you won 100 million!!!!!!");
                break;
            }
        }
    }
}
