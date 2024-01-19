package jan16;

public class doWhileMultiplication {
    public static void main(String[] args){
        int firstValue=5;
        int valuesUpTo=10;
        int count=1;
        do{
            System.out.println(firstValue + " * " + count + " = " + firstValue*count);
            count++;
        } while (count<=valuesUpTo);
    }
}
