package feb3;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int howMany= sc.nextInt();
        char[] ch = new char[howMany];
        for( int i=0; i < ch.length; i++){
            ch[i]=sc.next().charAt(0);
        }
        for(int i : ch){
            System.out.println(i);
        }
    }
}
