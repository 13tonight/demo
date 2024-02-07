package assignments.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String palin= sc.next();
        String reverse = "";
        for( int i= palin.length()-1 ; i>=0 ;i--){
            reverse += (palin.charAt(i));
        }
        //System.out.println(reverse);
        if( palin.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
