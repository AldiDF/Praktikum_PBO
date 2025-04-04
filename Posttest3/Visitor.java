package Posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Visitor extends User {
    private String domisili;
    private static ArrayList <Visitor> pengunjung = new ArrayList<>();

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

    public static void selfData(String session){
        Main.clearScreen();
        for (Visitor i : pengunjung) {
            if (i.userid.equals(session)){
                System.out.println("=========================================================================");
                System.out.println("========================== DATA DIRI PENGUNJUNG =========================");
                System.out.println("=========================================================================");
                System.out.println("Username       : " + i.getUsername());
                System.out.println("Nama Lengkap   : " + i.getFullname());
                System.out.println("Email          : " + i.getEmail());
                System.out.println("Nomor Telepon  : " + i.getPhone());
                System.out.println("Domisili       : " + i.getDomisili());
                System.out.println("=========================================================================");
            }
        }
    }

    public static void updateData(String session){
        Scanner inputUpdate = new Scanner(System.in);
        selfData(session);

        System.out.print("\nMasukkan nama lengkap Baru: ");
        String fullname = inputUpdate.nextLine();
        System.out.print("Masukkan email Baru: ");
        String email = inputUpdate.nextLine();
        System.out.print("Masukkan nomor telepon Baru: ");
        String phone = inputUpdate.nextLine();
        System.out.print("Masukkan domisili Baru: ");
        String domisili = inputUpdate.nextLine();
        
        for (Visitor i : pengunjung) {
            if (i.userid.equals(session)){
                i.setFullname(fullname);
                i.setEmail(email);;
                i.setPhone(phone);;
                i.setDomisili(domisili);;

                Main.clearScreen();
                Main.greenColor();
                System.out.println("=========================================================================");
                System.out.println("======================== BERHASIL MENGUBAH DATA =========================");    
                System.out.println("=========================================================================");
                Main.blueColor();
                Main.delay(1000);
            }
        }
    }

    public static void registerVisitor(){
        Scanner inputRegister = new Scanner(System.in);
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("========================== REGISTER PENGUNJUNG ==========================");
        System.out.println("=========================================================================");
        System.out.print("\nMasukkan username: ");
        String username = inputRegister.nextLine();

        System.out.print("Masukkan password: ");
        String password = inputRegister.nextLine();

        System.out.print("Masukkan nama lengkap: ");
        String fullname = inputRegister.nextLine();

        System.out.print("Masukkan email: ");
        String email = inputRegister.nextLine();

        System.out.print("Masukkan nomor telepon: ");
        String phone = inputRegister.nextLine();

        System.out.print("Masukkan domisili: ");
        String domisili = inputRegister.nextLine();
        
        for (Visitor i : pengunjung) {
            if (i.userid.equals(username)){
                Main.clearScreen();
                Main.redColor();
                System.out.println("=========================================================================");
                System.out.println("========================= USERNAME SUDAH ADA ============================");
                System.out.println("=========================================================================");
                Main.blueColor();
                Main.delay(1000);
                registerVisitor();
            }
        }
        pengunjung.add(new Visitor(username, password, fullname, email, phone, domisili));
        Main.clearScreen();
        Main.greenColor();
        System.out.println("=========================================================================");
        System.out.println("==================== REGISTER PENGUNJUNG BERHASIL =======================");
        System.out.println("=========================================================================");
        Main.blueColor();
        Main.delay(1000);
    }

    public static void loginVisitor(){
        Scanner inputLogin = new Scanner(System.in);
        
        while (true){
            Main.clearScreen();
            System.out.println("=========================================================================");
            System.out.println("=========================== LOGIN PENGUNJUNG ============================");
            System.out.println("=========================================================================");
            System.out.print("\nMasukkan username: ");
            String username = inputLogin.nextLine();
            System.out.print("Masukkan password: ");
            String password = inputLogin.nextLine();

            for (Visitor i : pengunjung){
                if (i.getUsername().equals(username) && i.getPassword().equals(password)){
                    Main.clearScreen();
                    Main.greenColor();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGIN BERHASIL ================================");
                    System.out.println("=========================================================================");
                    Main.blueColor();
                    Main.delay(1000);
                    Main.menu_pengunjung(username);
                }
            }
            Main.clearScreen();
            Main.redColor();
            System.out.println("=========================================================================");
            System.out.println("========================== LOGIN GAGAL ==================================");
            System.out.println("=========================================================================");
            Main.blueColor();
            Main.delay(1000);
            break;
            
        }
    }

    public static void dataVisitor(){
        pengunjung.add(new Visitor("user", "user", "user", "user", "user", "user"));
        pengunjung.add(new Visitor("pengunjung", "pengunjung", "pengunjung", "pengunjung", "pengunjung", "pengunjung"));
    }

}
