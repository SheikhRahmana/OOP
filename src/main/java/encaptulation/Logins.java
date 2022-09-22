package encaptulation;

public class Logins {
    private String userName;
    private String passWord;
    public Logins(String userName,String passWord){
      this.userName=userName;
      this.passWord=passWord;
    }
    /*
    When we use construcor to set value then we don't need to create setter method to set value
    because construcor is doint this jobs for us. we only need to getter method
     */
    public String getUserName(){
        return userName;
    }
    public String getPassWord(){
        return passWord;
    }
}
