package Jan30;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the how many numbers we need: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i=0;i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int big=0;
        for(int i = 0;i< arr.length; i++){
            big = arr[i];
            if(arr[i]>big){
                big=arr[i];
            }
            //System.out.println(arr[i]);
        }
        System.out.println("Biggest number in the array " + big);

        for(int x : arr){
            System.out.println(x);
        }
        System.out.println("=============================Reverse an array======================");
//        for(int i=arr.length-1;i<0;i--){
//            System.out.println(arr[i]);
//        }
    }

}
