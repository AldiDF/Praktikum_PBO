package Posttest2;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    protected String userid;
    protected String password;
    protected String fullname;
    protected String email;
    protected String phone;

    protected static ArrayList <Employee> pegawai = new ArrayList<>();

    public static void registerEmployee(){
        Scanner inputRegister = new Scanner(System.in);
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("============================= REGISTER USER =============================");
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

        System.out.print("Masukkan jabatan: ");
        String jabatan = inputRegister.nextLine();
        
        for (Employee i : pegawai) {
            if (i.userid.equals(username)){
                Main.clearScreen();
                Main.redColor();
                System.out.println("=========================================================================");
                System.out.println("========================= USERNAME SUDAH ADA ============================");
                System.out.println("=========================================================================");
                Main.blueColor();
                Main.delay(1000);
                registerEmployee();
            }
        }

        pegawai.add(new Employee(username, password, fullname, email, phone, Main.localTime(), jabatan));
        Main.clearScreen();
        Main.greenColor();
        System.out.println("=========================================================================");
        System.out.println("====================== REGISTER PEGAWAI BERHASIL ========================");
        System.out.println("=========================================================================");
        Main.blueColor();
        Main.delay(1000);
        
    }

    public static void loginEmployee(){
        Scanner inputLogin = new Scanner(System.in);
        
        while (true){
            Main.clearScreen();
            System.out.println("=========================================================================");
            System.out.println("============================= LOGIN PEGAWAI =============================");
            System.out.println("=========================================================================");
            System.out.print("\nMasukkan username: ");
            String username = inputLogin.nextLine();
            System.out.print("Masukkan password: ");
            String password = inputLogin.nextLine();

            for (Employee i : pegawai){
                if (i.userid.equals(username) && i.password.equals(password)){
                    Main.clearScreen();
                    Main.greenColor();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGIN BERHASIL ================================");
                    System.out.println("=========================================================================");
                    Main.blueColor();
                    Main.delay(1000);
                    Employee.menu_pegawai();
                    
                    
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

    public static void dataEmployee(){
        pegawai.add(new Employee("admin", "admin", "admin", "admin", "admin", Main.localTime(), "admin"));
        pegawai.add(new Employee("pegawai", "pegawai", "pegawai", "pegawai", "pegawai", Main.localTime(), "pegawai"));
    }
}


