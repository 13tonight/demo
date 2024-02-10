package feb10.encapsulation;

public class WriteOnly {
    private String userName;
    private String password;

    public WriteOnly(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void loginUser(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            System.out.println("welcome to the app!");
        }
        else {
            System.out.println("Invalid user");
        }
    }
}
