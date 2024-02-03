package feb3;

public class StringDemo {
    public static void main(String[] args){
        String s1= "hello";
        String s2= "hello";
        String s3= "hello";
        String s4= new String("hello");
        String s5= new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s5));
    }
}
