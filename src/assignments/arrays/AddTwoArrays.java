package assignments.arrays;

import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args){
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};
        int[][] array3 = new int[3][3];
        for(int i=0 ; i < array1.length ; i++){
            for(int j=0 ; j < array1[i].length ; j++){
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for(int[] x : array3){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
