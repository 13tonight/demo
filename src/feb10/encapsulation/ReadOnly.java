package feb10.encapsulation;

public class ReadOnly {
    private String userName;
    private String password;

    public ReadOnly(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
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
