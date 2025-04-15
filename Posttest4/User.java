package Posttest4;

public class User {
    protected String userid;
    protected String password;
    protected String fullname;
    protected String email;
    protected String phone;


    public User(String userid, String password, String fullname, String email, String phone) {
        this.userid = userid;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    String getUsername(){
        return userid;
    }

    String getPassword(){
        return password;
    }

    String getFullname(){
        return fullname;
    }

    String getEmail(){
        return email;
    }

    String getPhone(){
        return phone;
    }

    public void selfData(){
        System.out.println("Self Data");
    }

    public boolean verifyLogin(String username, String password){
        System.out.println("Verifikasi Login");
        return true;
    }

    public boolean verifyRegister(String username){
        System.out.println("Verifikasi Register");
        return true;
    }
}


