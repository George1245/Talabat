package talabat;
public abstract class User {
    String Username;
    String Password;
    public User(String username,String password) {
        Username = username;
        Password = password;
    }
    public void login(String user,String pass) {
        if (this.Username.equals(user)&&this.Password.equals(pass)){
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
    public abstract void show();
}