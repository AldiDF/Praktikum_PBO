package BioMuseum;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

// Judul Tema : Sistem Informasi Manajemen Spesimen Museum Biologi "BioMuseum" Berbasis Website
public class Main {
    static ArrayList <Employee> pegawai = new ArrayList<>();
    static ArrayList <Specimen> spesimen = new ArrayList<>();
    public static void main(String[] args){
        firstData();
        main_menu();
    }

    public static void main_menu(){
        Scanner inputMenu = new Scanner(System.in);
        while (true){
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("====================== SELAMAT DATANG DI BIOMUSEUM ======================");
            System.out.println("=========================================================================");
            delay(1000);
            
            System.out.println("\n[1] Login");
            System.out.println("[2] Register");
            System.out.println("[3] Exit");
            System.out.print("\nMasukkan pilihan: ");
            int menu = inputMenu.nextInt();
            inputMenu.nextLine();
    
            switch (menu) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Terima kasih telah mengunjungi BIOMUSEUM");
                    System.exit(0);
                    break;

                default:
                clearScreen();
                System.out.println("=========================================================================");
                System.out.println("=========================== PILIHAN TIDAK ADA ===========================");
                System.out.println("=========================================================================");
                delay(1000);
                    
            }
        }
    }

    public static void register(){
        Scanner inputRegister = new Scanner(System.in);
        clearScreen();
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

        System.out.print("Masukkan tanggal bergabung: ");
        String tanggal = inputRegister.nextLine();

        System.out.print("Masukkan jabatan: ");
        String jabatan = inputRegister.nextLine();
        for (Employee i : pegawai) {
            if (i.userid.equals(username)){
                clearScreen();
                System.out.println("=========================================================================");
                System.out.println("========================= USERNAME SUDAH ADA ============================");
                System.out.println("=========================================================================");
                delay(1000);
                register();
            }
        }

        pegawai.add(new Employee(username, password, fullname, email, phone, tanggal, jabatan));
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("======================== REGISTER USER BERHASIL =========================");
        System.out.println("=========================================================================");
        delay(1000);
        
    }

    public static void login(){
        Scanner inputLogin = new Scanner(System.in);
        
        while (true){
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("=============================== LOGIN USER ==============================");
            System.out.println("=========================================================================");
            System.out.print("\nMasukkan username: ");
            String username = inputLogin.nextLine();
            System.out.print("Masukkan password: ");
            String password = inputLogin.nextLine();

            for (Employee i : pegawai){
                if (i.userid.equals(username) && i.password.equals(password)){
                    clearScreen();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGIN BERHASIL ================================");
                    System.out.println("=========================================================================");
                    delay(1000);
                    menu_pegawai();
                    
                    
                }
            }
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("========================== LOGIN GAGAL ==================================");
            System.out.println("=========================================================================");
            delay(1000);
            
        }
    }

    public static void menu_pegawai(){
        Scanner inputMenuPegawai = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("======================== MENU UTAMA PEGAWAI =============================");
            System.out.println("=========================================================================");
            
            System.out.println("\n[1] Tampilkan data Pegawai");
            System.out.println("[2] Tampilkan Daftar Spesimen ");
            System.out.println("[3] Tambah Spesimen");
            System.out.println("[4] Ubah Spesimen");
            System.out.println("[5] Hapus Spesimen");
            System.out.println("[6] Logout");
            System.out.print("\nMasukkan pilihan: ");
            int menu = inputMenuPegawai.nextInt();
            inputMenuPegawai.nextLine();
    
            switch (menu) {
                case 1:
                    Employee.employeeData();
                    back();
                    break;

                case 2:
                    Employee.showSpecimen();
                    back();
                    break;

                case 3:
                    Employee.addSpecimen();
                    break;
                case 4:
                    Employee.updateSpecimen();
                    break;
                case 5:
                    Employee.deleteSpecimen();
                    break;
                case 6:
                    clearScreen();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGOUT BERHASIL ===============================");
                    System.out.println("=========================================================================");
                    delay(1000);
                    main_menu();
                    break;

                default:
                    System.out.println("=========================================================================");
                    System.out.println("=========================== PILIHAN TIDAK ADA ===========================");
                    System.out.println("=========================================================================");
            }
        }
    }

    public static void firstData(){
        
        pegawai.add(new Employee("admin", "admin", "admin", "admin", "admin", localTime(), "admin"));
        pegawai.add(new Employee("user", "user", "user", "user", "user", localTime(), "user"));
        pegawai.add(new Employee("pegawai", "pegawai", "pegawai", "pegawai", "pegawai", localTime(), "pegawai"));
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(int delay){
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void back(){
        try {
            System.out.print("\nTekan Enter Untuk Kembali");
            System.in.read();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String localTime(){
        SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = new Date();
        String date = pattern.format(now).toString();
        return date;
    }
}