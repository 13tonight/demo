package jan16;

public class factorial {
    public static void main(String[] args){
        int factorialNumber = 4;
        int finalNumber = 1;
        while(factorialNumber >= 1){
            finalNumber *= factorialNumber;
            factorialNumber--;
        }
        System.out.println(finalNumber);
    }
}
