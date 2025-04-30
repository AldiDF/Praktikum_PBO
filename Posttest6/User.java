package Posttest6;

public abstract class User {
    protected final String userid;
    protected final String password;
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

    
    protected final String getUsername(){
        return userid;
    }

    protected final String getPassword(){
        return password;
    }

    protected final String getFullname(){
        return fullname;
    }

    protected final String getEmail(){
        return email;
    }

    protected final String getPhone(){
        return phone;
    }

    public void selfData(){
        System.out.println("Self Data");
    }

    public abstract boolean verifyRegister(String username);
    public abstract boolean verifyLogin(String username, String password);
}

