package jan20;

import java.util.Scanner;

public class areas {
    public static void main(String[] args){
        calculatorMethods cals = new calculatorMethods();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the side of a square: ");
        double side = sc.nextDouble();
        System.out.println("Enter the length of a rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of a rectangle: ");
        double width = sc.nextDouble();
        System.out.println(cals.circleArea(radius));
        System.out.println(cals.sqaureArea(side));
        System.out.println(cals.rectArea(length , width));
    }
}
