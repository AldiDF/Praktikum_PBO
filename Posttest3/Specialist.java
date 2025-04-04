package Posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Specialist extends User {
    private String keahlian;
    private String institusi;
    private static ArrayList <Specialist> spesialis = new ArrayList<>();

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

    public static void registerSpecialist(){
        Scanner inputRegister = new Scanner(System.in);
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== REGISTER Spesialis ==========================");
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

        System.out.print("Masukkan keahlian: ");
        String keahlian = inputRegister.nextLine();

        System.out.print("Masukkan institusi: ");
        String institusi = inputRegister.nextLine();

        for (Specialist i : spesialis) {
            if (i.userid.equals(username)){
                Main.clearScreen();
                Main.redColor();
                System.out.println("=========================================================================");
                System.out.println("========================= USERNAME SUDAH ADA ============================");
                System.out.println("=========================================================================");
                Main.blueColor();
                Main.delay(1000);
                registerSpecialist();
            }
        }
        spesialis.add(new Specialist(username, password, fullname, email, phone, keahlian, institusi));
        Main.clearScreen();
        Main.greenColor();
        System.out.println("=========================================================================");
        System.out.println("===================== REGISTER SPESIALIS BERHASIL =======================");
        System.out.println("=========================================================================");
        Main.blueColor();
        Main.delay(1000);
    }

    public static void loginSpecialist(){
        Scanner inputLogin = new Scanner(System.in);
        
        while (true){
            Main.clearScreen();
            System.out.println("=========================================================================");
            System.out.println("============================ LOGIN SPESIALIS ============================");
            System.out.println("=========================================================================");
            System.out.print("\nMasukkan username: ");
            String username = inputLogin.nextLine();
            System.out.print("Masukkan password: ");
            String password = inputLogin.nextLine();

            for (Specialist i : spesialis){
                if (i.getUsername().equals(username) && i.getPassword().equals(password)){
                    Main.clearScreen();
                    Main.greenColor();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGIN BERHASIL ================================");
                    System.out.println("=========================================================================");
                    Main.blueColor();
                    Main.delay(1000);
                    Main.menu_spesialis(username);
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
    
    public static void selfData(String session){
        Main.clearScreen();
        for (Specialist i : spesialis) {
            if (i.userid.equals(session)){
                System.out.println("=========================================================================");
                System.out.println("========================== DATA DIRI SPESIALIS =========================");
                System.out.println("=========================================================================");
                System.out.println("Username       : " + i.getUsername());
                System.out.println("Nama Lengkap   : " + i.getFullname());
                System.out.println("Email          : " + i.getEmail());
                System.out.println("Nomor Telepon  : " + i.getPhone());
                System.out.println("Keahlian       : " + i.getKeahlian());
                System.out.println("Institusi      : " + i.getInstitusi());
                System.out.println("=========================================================================");
            }
        }
    }

    public static void monitoringSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            Employee.showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin diperiksa: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();

                for (int i = 0; i < Specimen.spesimen.size(); i++){
                    if (Specimen.spesimen.get(i).getId() == id){
                        Specimen specimen = Specimen.spesimen.get(i);
        
                        Main.clearScreen();
                        Specimen.detailSpecimen(specimen);
                        System.out.println("\nBerikan rekomendasi pada spesimen ini untuk dilakukan");
                        System.out.println("perawatan lebih lanjut oleh pihak museum");
                        System.out.print("\nMasukkan Hasil Pemeriksaan: ");
                        String hasil_pemeriksaan = inputSpecimen.nextLine();
                        
                        specimen.setKondisi("Selesai Diperiksa");
                        specimen.setHasilPemeriksaan(hasil_pemeriksaan);
                        specimen.setTanggalPemeriksaan(Main.localTime());
        
                        Main.clearScreen();
                        Main.greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("===================== BERHASIL MENYIMPAN REKOMENDASI ====================");    
                        System.out.println("=========================================================================");
                        Main.blueColor();
                        Main.delay(1000);
                        return;
                    }
                }
                Main.clearScreen();
                Main.None();
                Main.delay(1000);

            } catch(Exception e){ 
                Main.clearScreen();
                Main.backDir();
                Main.delay(1000);
                return;
            }
        }
    }

    public static void dataSpecialist(){
        spesialis.add(new Specialist("spesialis", "spesialis", "spesialis", "spesialis", "spesialis", "spesialis", "spesialis"));
    }
}   
