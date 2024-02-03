package assignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayBigNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arrayMethod arraysMethod = new arrayMethod();
        System.out.println("Enter the length of the array: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for(int i = 0;i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("=======================Biggest number in the array=============================");
        System.out.println(arraysMethod.bigNumber(arr));
        System.out.println("=======================Smallest number in the array=============================");
        System.out.println(arraysMethod.minimumNumber(arr));
        System.out.println("=======================Sum of all number in the array=============================");
        System.out.println(arraysMethod.sumOfAllArray(arr));
        System.out.println("=======================Average of all number in the array=============================");
        System.out.println(arraysMethod.averageOfArray(arr));
        System.out.println("=======================Second largest of all number in the array=============================");
        System.out.println(arraysMethod.secondlarget(arr));
        System.out.println("=======================Second smallest of all number in the array=============================");
        System.out.println(arraysMethod.secondSmallest(arr));
        System.out.println("=======================Sort an array=============================");
        System.out.println(arraysMethod.sortArray(arr));
    }

}
