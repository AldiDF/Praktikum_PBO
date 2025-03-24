package Posttest2;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

// Judul Tema : Sistem Informasi Manajemen Spesimen Museum Biologi "BioMuseum" Berbasis Website
public class Main {
    public static void main(String[] args){
        User.dataEmployee();
        Visitor.dataVisitor();
        Specimen.dataSpecimen();
        blueColor();
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
            
            System.out.println("\n[1] Login Sebagai Pegawai");
            System.out.println("[2] Register Sebagai Pegawai");
            System.out.println("[3] Login Sebagai Pengunjung");
            System.out.println("[4] Register Sebagai Pengunjung");
            System.out.println("[5] Exit");
            System.out.print("\nMasukkan pilihan: ");
            int menu = inputMenu.nextInt();
            inputMenu.nextLine();
    
            switch (menu) {
                case 1:
                    Employee.loginEmployee();
                    break;

                case 2:
                    Employee.registerEmployee();
                    break;

                case 3:
                    Visitor.loginVisitor();
                    break;

                case 4:
                    Visitor.registerVisitor();
                    break;
                    
                case 5:
                    System.out.println("Terima kasih telah mengunjungi BIOMUSEUM");
                    System.exit(0);
                    break;

                default:
                clearScreen();
                None();
                delay(1000);
                    
            }
        }
    }

    public static void menu_pengunjung(String session){    
        Scanner inputMenu = new Scanner(System.in);
        while (true){
            Main.clearScreen();
            System.out.println("=========================================================================");
            System.out.println("=========================== MENU PENGUNJUNG =============================");
            System.out.println("=========================================================================");
            System.out.println("\n[1] Lihat Daftar Spesimen ");
            System.out.println("[2] Lihat Data Diri");
            System.out.println("[3] Ubah Data Diri");
            System.out.println("[4] Logout");
            System.out.print("\nMasukkan pilihan: ");
            int menu = inputMenu.nextInt();
            inputMenu.nextLine();
    
            switch (menu) {
                case 1:
                    Employee.showSpecimen();
                    Main.back();
                    break;

                case 2:
                    Visitor.selfData(session);;
                    Main.back();
                    break;

                case 3:
                    Visitor.updateData(session);
                    break;

                case 4:
                    Main.clearScreen();
                    greenColor();
                    System.out.println("=========================================================================");
                    System.out.println("=========================== LOGOUT BERHASIL =============================");
                    System.out.println("=========================================================================");
                    blueColor();
                    Main.delay(1000);
                    Main.main_menu();
                    break;

                default:
                Main.clearScreen();
                Main.None();
                Main.delay(1000);
            }
        }
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

    public static void None(){
        redColor();
        System.out.println("=========================================================================");
        System.out.println("=========================== PILIHAN TIDAK ADA ===========================");
        System.out.println("=========================================================================");
        blueColor();
    }

    public static void backDir(){
        greenColor();
        System.out.println("=========================================================================");
        System.out.println("================================= KEMBALI ===============================");
        System.out.println("=========================================================================");
        blueColor();
    }

    public static void blueColor(){
        System.out.print("\033[0;34m");
    }

    public static void redColor(){
        System.out.print("\033[0;31m");
    }

    public static void greenColor(){
        System.out.print("\033[0;32m");
    }
}