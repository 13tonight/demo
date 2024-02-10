package feb10.encapsulation;

public class ReadOnlyClass {
    public static void main(String[] args) {
        ReadOnly read=  new ReadOnly("pragra","pragra");
        System.out.println(read.getUserName());
        System.out.println(read.getPassword());

    }
}
