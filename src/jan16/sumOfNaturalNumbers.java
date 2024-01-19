package jan16;

public class sumOfNaturalNumbers {
    public static void main(String[] args){
        int count = 1;
        int natural = 0;
        while(count <= 10){
            natural += count;
            count++;
        }
        System.out.println(natural);
    }
}
