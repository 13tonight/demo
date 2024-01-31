package Jan30;

import java.util.Scanner;


public class CharArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char[] charArray= new char[5];
        charArray[0] = 'c';
        charArray[1] = 'h';
        charArray[2] = 'a';
        charArray[3] = 'r';
        charArray[4] = 's';
        for(char i:charArray){
            System.out.println(i);
        }
    }
}
