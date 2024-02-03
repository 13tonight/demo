package assignments.arrays;

public class arrayMethod {
    int bigNumber = 0;
    int minimumNumber = 0;
    int sum=0;
    double average=0;
    int secondlargest=0;
    int secondSmallest=0;
    int min=0;

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
    //Average Length
    public double averageOfArray(int[] arr){
        int averageSum=sumOfAllArray(arr);
        average= (double) averageSum /arr.length;
        return average;
    }
    //Second-largest number
    public int secondlarget(int[] arr){
        int firstBig= bigNumber(arr);
        secondlargest = arr[0];
        for(int i : arr){
            if(i > secondlargest && i != firstBig){
                secondlargest=i;
            }
        }
        return secondlargest;
    }
    //Second smallest array
    public int secondSmallest(int[] arr){
        int smallest = minimumNumber(arr);
         secondSmallest = bigNumber(arr);
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }

    public boolean sortArray(int[] arr){
        int temp=0;
        for(int i : arr) {
            for (int j = 1; j < arr.length; j++) {
                if (i > arr[j]) {
                    temp = i;
                    i = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(i);
        }
        return true;
    }
}

