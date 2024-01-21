package jan20;

import com.sun.source.doctree.SystemPropertyTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        calculatorMethods cal= new calculatorMethods();
        Scanner sc= new Scanner(System.in);
        int i=1;
        double num3 = 0;
        double num4 = 0;
        System.out.println("How many variables we need to  enter: ");
        int variableSelection=sc.nextInt();
        if(variableSelection >= 2 && variableSelection <=4) {
            do {
                System.out.println("Enter the number 1 : ");
                double num1 = sc.nextDouble();
                System.out.println("Enter the number 2 : ");
                double num2 = sc.nextDouble();
                if(variableSelection>=3){
                    System.out.println("Enter the number 3 : ");
                    num3 = sc.nextDouble();
                }if (variableSelection >=4) {
                    System.out.println("Enter the number 4 : ");
                    num4 = sc.nextDouble();
                }
                if (i == 1) {
                    if(variableSelection<4){
                        System.out.println("1 for addition");
                        System.out.println("2 for subtraction");
                        System.out.println("3 for multiplication");
                    }else {
                        System.out.println("4 for division");
                    }

                }
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        switch (variableSelection){
                            case 2:
                                int sum = cal.add((int) num1, (int) num2);
                                System.out.println(sum);
                                break;
                            case 3:
                                sum = cal.add((int) num1, (int) num2, (int) num3);
                                System.out.println(sum);
                                break;
                            case 4:
                                sum= cal.add((int) num1, (int) num2, (int) num3, (int) num4);
                                System.out.println(sum);
                                break;
                        }
                        break;
                        //sum = cal.add((int) num1, (int) num2, (int) num3);
                        //System.out.println(sum);
                    case 2:
                        switch (variableSelection){
                            case 2:
                                int sub = cal.sub((int) num1, (int) num2);
                                System.out.println(sub);
                                break;
                            case 3:
                                sub = cal.sub((int) num1, (int) num2, (int) num3);
                                System.out.println(sub);
                                break;
                            case 4:
                                sub= cal.sub((int) num1, (int) num2, (int) num3, (int) num4);
                                System.out.println(sub);
                                break;
                        }
                        //int sub = cal.sub((int) num1, (int) num2);
                        //System.out.println(sub);
                        break;
                    case 3:
                        switch (variableSelection){
                            case 2:
                                double multi = cal.multi(num1, num2);
                                System.out.println(multi);
                                break;
                            case 3:
                                multi = cal.multi( num1, num2, num3);
                                System.out.println(multi);
                                break;
                            case 4:
                                multi= cal.multi( num1, num2, num3, num4);
                                System.out.println(multi);
                                break;
                        }
                        //double mul = cal.multi(num1, num2);
                        //System.out.println(mul);
                        break;
                    case 4:
                        double div = cal.div(num1, num2);
                        System.out.println(div);
                        break;

                }
                System.out.println("Do you want to try with more numbers: ");
                String ans = sc.next();
                if (ans.equals("yes")) {
                    System.out.println("How many variables do you need again? ");
                    variableSelection=sc.nextInt();
                    i++;
                } else {
                    break;
                }
            } while (i <= 1 + i);
        }else
            System.out.println("woo-ops you have to choose atleast 2 values and we only limited to 4 values");


    }
}
