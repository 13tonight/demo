package feb10.encapsulation;

import com.sun.security.jgss.GSSUtil;

public class encapBothType {
    private String userName;
    private String password;

    public encapBothType(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
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
