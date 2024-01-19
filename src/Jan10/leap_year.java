package Jan10;

public class leap_year {
    public static void main(String[] args){
        int x = 2025;
        if(( x % 4 == 0 && x % 100 != 0)|| x % 400 == 0){
            System.out.println(x+ " It is a leap year");
        } else
            System.out.println(x +  " it is a not leap year");
    }
}
