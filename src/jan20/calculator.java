package jan20;

import com.sun.source.doctree.SystemPropertyTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        calculatorMethods cal= new calculatorMethods();
        Scanner sc= new Scanner(System.in);
        int i=1;
        do {
            System.out.println("Enter the number: ");
            double num1=sc.nextDouble();
            System.out.println("Enter the number: ");
            double num2= sc.nextDouble();
            int sum=cal.add((int) num1, (int) num2);
            int sub=cal.sub((int) num1, (int) num2);
            double mul=cal.multi( num1 , num2);
            double div=cal.div( num1 ,  num2);
            System.out.println(sum);
            System.out.println(sub);
            System.out.println(mul);
            System.out.println(div);
            System.out.println("Do you want to try with more numbers: ");
            String ans=sc.next();
            if (ans.equals("yes")) {
                i++;
            }else {
                break;
            }
        }while(i<=1+i);


    }
}
