package assignments.arrays;

public class arrayMethod {
    int bigNumber = 0;
    int minimumNumber = 0;
    int sum=0;
    double average=0;

    public int bigNumber(int[] arr) {
        bigNumber = arr[0];
        for (int i : arr) {
            if (i > bigNumber) {
                bigNumber = i;
            }
            //System.out.println(i);
        }
        return bigNumber;
    }

    //Minimum element
    public int minimumNumber(int[] arr) {
        minimumNumber = arr[0];
        for (int i : arr) {
            if (i < minimumNumber) {
                minimumNumber = i;
            }
        }
        return minimumNumber;
    }

    //Sum of array
    public int sumOfAllArray(int[] arr){
        sum=0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public double averageOfArray(int[] arr){
        int averageSum=sumOfAllArray(arr);
        average= (double) averageSum /arr.length;
        return average;
    }
}

