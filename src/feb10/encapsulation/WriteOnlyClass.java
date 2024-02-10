package feb10.encapsulation;

public class WriteOnlyClass {
    public static void main(String[] args) {
        WriteOnly write = new WriteOnly("pragra", "pragra");
        write.setUserName("haswanth");
        write.setPassword("password");
        write.loginUser("haswanth","password");
    }
}
