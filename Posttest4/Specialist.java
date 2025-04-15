package Posttest4;

public class Specialist extends User {
    private String keahlian;
    private String institusi;
    

    public Specialist(String username, String password, String fullname, String email, String phone, String keahlian, String institusi) {
        super(username, password, fullname, email, phone);
        this.keahlian = keahlian;
        this.institusi = institusi;
    }

    String getKeahlian(){
        return keahlian;
    }

    String getInstitusi(){
        return institusi;
    }

    @Override
    public boolean verifyLogin(String username, String password){
        for (Specialist i : Main.spesialis) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verifyRegister(String username){
        for (Specialist i : Main.spesialis) {
            if (i.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void selfData(){
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("========================== DATA DIRI SPESIALIS =========================");
        System.out.println("=========================================================================");
        System.out.println("Username       : " + getUsername());
        System.out.println("Nama Lengkap   : " + getFullname());
        System.out.println("Email          : " + getEmail());
        System.out.println("Nomor Telepon  : " + getPhone());
        System.out.println("Keahlian       : " + getKeahlian());
        System.out.println("Institusi      : " + getInstitusi());
        System.out.println("=========================================================================");
        
    }

    

    public static void dataSpecialist(){
        Main.spesialis.add(new Specialist("spesialis", "spesialis", "spesialis", "spesialis", "spesialis", "spesialis", "spesialis"));
    }
}   
