package Jan30;

import java.util.Scanner;

public class TwoDimensional {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][] arrTwoD=new int[3][2];
        arrTwoD[0][0] = 10;
        arrTwoD[0][1] = 5;
        //arr[0][2] = 20;


        arrTwoD[1][0] = 15;
        arrTwoD[1][1] = 30;
        //arr[1][2] = 55;


        arrTwoD[2][0] = 21;
        arrTwoD[2][1] = 34;
        //arr[2][2] = 23;
        for(int[] x : arrTwoD){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
