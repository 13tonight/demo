package jan16;

public class doWhileSum {
    public static void main(String[] args){
        int finalValue = 10;
        int startValue = 1;
        int total = 0;
        do{
            total += startValue;
            startValue++;
        }while (startValue <= finalValue);
        System.out.println(total);
    }
}
