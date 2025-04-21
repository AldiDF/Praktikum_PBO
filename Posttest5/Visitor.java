package Posttest5;

public class Visitor extends User {
    private String domisili;
    

    public Visitor(String userid, String password, String fullname, String email, String phone, String domisili) {
        super(userid, password, fullname, email, phone);
        this.domisili = domisili;
    }

    String getDomisili(){
        return domisili;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setDomisili(String domisili){
        this.domisili = domisili;
    }

    @Override
    public boolean verifyLogin(String username, String password){
        for (Visitor i : Main.pengunjung) {
            if (i.userid.equals(username) && i.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verifyRegister(String username){
        for (Visitor i : Main.pengunjung) {
            if (i.userid.equals(username)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void selfData(){
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("========================== DATA DIRI PENGUNJUNG =========================");
        System.out.println("=========================================================================");
        System.out.println("Username       : " + getUsername());
        System.out.println("Nama Lengkap   : " + getFullname());
        System.out.println("Email          : " + getEmail());
        System.out.println("Nomor Telepon  : " + getPhone());
        System.out.println("Domisili       : " + getDomisili());
        System.out.println("=========================================================================");
    }

    public static void dataVisitor(){
        Main.pengunjung.add(new Visitor("user", "user", "user", "user", "user", "user"));
        Main.pengunjung.add(new Visitor("pengunjung", "pengunjung", "pengunjung", "pengunjung", "pengunjung", "pengunjung"));
    }

}
