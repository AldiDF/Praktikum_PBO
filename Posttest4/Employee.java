package Posttest4;

public class Employee extends User {
    private String tanggal_bergabung;
    private String jabatan;
    
    public Employee(String userid, String password, String fullname, String email, String phone, String tanggal_bergabung, String jabatan) {
        super(userid, password, fullname, email, phone);
        this.tanggal_bergabung = tanggal_bergabung;
        this.jabatan = jabatan;
    }

    String getTanggalBergabung(){
        return tanggal_bergabung;
    }

    String getJabatan(){
        return jabatan;
    }

    @Override
    public boolean verifyLogin(String username, String password){
        for (Employee i : Main.pegawai) {
            if (i.userid.equals(username) && i.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verifyRegister(String username){
        for (Employee i : Main.pegawai) {
            if (i.userid.equals(username)){
                return true;
            }
        }
        return false;
    }

    public static void dataEmployee(){
        Main.pegawai.add(new Employee("admin", "admin", "admin", "admin", "admin", Main.localTime(), "admin"));
        Main.pegawai.add(new Employee("pegawai", "pegawai", "pegawai", "pegawai", "pegawai", Main.localTime(), "pegawai"));
    }

}
