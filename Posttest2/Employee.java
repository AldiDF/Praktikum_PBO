package Posttest2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends User {
    private String tanggal_bergabung;
    private String jabatan;
    
    public Employee(String userid, String password, String fullname, String email, String phone, String tanggal_bergabung, String jabatan) {
        this.userid = userid;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.tanggal_bergabung = tanggal_bergabung;
        this.jabatan = jabatan;
    }

    public static void employeeData(){
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("====================== TAMPILKAN DATA PEGAWAI ===========================");
        System.out.println("=========================================================================");
        Main.delay(1000);
        Main.clearScreen();

        System.out.println("=========================================================================");
        System.out.println("========================== DAFTAR PEGAWAI ===============================");
        System.out.println("=========================================================================");
        for (Employee i : pegawai) {
            System.out.println("\n=========================================================================");
            System.out.println("Username          : " + i.userid);
            System.out.println("Nama Lengkap      : " + i.fullname);
            System.out.println("Email             : " + i.email);
            System.out.println("Nomor Telepon     : " + i.phone);
            System.out.println("Tanggal Bergabung : " + i.tanggal_bergabung);
            System.out.println("Jabatan           : " + i.jabatan);
            System.out.println("=========================================================================");
        }
    }

    public static void showSpecimen(){
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("====================== TAMPILKAN DATA SPESIMEN ==========================");
        System.out.println("=========================================================================");
        Main.delay(1000);
        
        if (Specimen.spesimen.isEmpty()){
            Main.clearScreen();
            System.out.println("=========================================================================");
            System.out.println("======================= DATA SPESIMEN KOSONG ============================");
            System.out.println("=========================================================================");
            Main.delay(1000);
            return;
        }
        
        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("========================== DAFTAR SPESIMEN ==============================");
        System.out.println("=========================================================================");
        for (Specimen i : Specimen.spesimen) {
            System.out.println("\n=========================================================================");
            System.out.println("ID                : " + i.id);
            System.out.println("Nama Spesimen     : " + i.nama_spesimen);
            System.out.println("Nama Ilmiah       : " + i.nama_ilmiah);
            System.out.println("Jenis Spesimen    : " + i.jenis_spesimen);
            System.out.println("Metode Pengawetan : " + i.metode_pengawetan);
            System.out.println("Tanggal Masuk     : " + i.tanggal_masuk);
            System.out.println("Jumlah            : " + i.jumlah);
            System.out.println("Deskripsi Singkat : " + i.deskripsi);
            System.out.println("=========================================================================");
        }
    }

    public static void addSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        int id;

        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== TAMBAH SPESIMEN =============================");
        System.out.println("=========================================================================");
        Main.delay(1000);

        if (Specimen.spesimen.isEmpty()){
            id = 1;

        } else {
            id = Specimen.spesimen.size() + 1;
        }
        
        System.out.print("\nMasukkan Nama Spesimen: ");
        String nama_spesimen = inputSpecimen.nextLine();

        System.out.print("Masukkan Nama Ilmiah: ");
        String nama_ilmiah = inputSpecimen.nextLine();

        System.out.print("Masukkan Jenis Spesimen: ");
        String jenis_spesimen = inputSpecimen.nextLine();

        System.out.print("Masukkan Metode Pengawetan: ");
        String metode_pengawetan = inputSpecimen.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int jumlah = inputSpecimen.nextInt();
        inputSpecimen.nextLine();

        System.out.print("Masukkan Deskripsi Singkat: ");
        String deskripsi = inputSpecimen.nextLine();

        Specimen.spesimen.add(new Specimen(id, nama_spesimen, nama_ilmiah, jenis_spesimen, metode_pengawetan, Main.localTime() ,jumlah, deskripsi));

        Main.clearScreen();
        Main.greenColor();
        System.out.println("=========================================================================");
        System.out.println("==================== BERHASIL MENAMBAHKAN SPESIMEN ======================");
        System.out.println("=========================================================================");
        Main.blueColor();
        Main.delay(1000);
    }

    public static void updateSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin diubah: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();

                for (int i = 0; i < Specimen.spesimen.size(); i++){
                    if (Specimen.spesimen.get(i).id == id){
                        Specimen specimen = Specimen.spesimen.get(i);
        
                        Main.clearScreen();
                        System.out.print("\nMasukkan Nama Spesimen Baru: ");
                        String nama_spesimen = inputSpecimen.nextLine();
                    
                        System.out.print("Masukkan Nama Ilmiah Baru: ");
                        String nama_ilmiah = inputSpecimen.nextLine();
                    
                        System.out.print("Masukkan Jenis Spesimen Baru: ");
                        String jenis_spesimen = inputSpecimen.nextLine();
                    
                        System.out.print("Masukkan Metode Pengawetan Baru: ");
                        String metode_pengawetan = inputSpecimen.nextLine();
                    
                        System.out.print("Masukkan Jumlah Baru: ");
                        int jumlah = inputSpecimen.nextInt();
                        inputSpecimen.nextLine();
                    
                        System.out.print("Masukkan Deskripsi Singkat: ");
                        String deskripsi = inputSpecimen.nextLine();
        
                        specimen.nama_spesimen = nama_spesimen;
                        specimen.nama_ilmiah = nama_ilmiah;
                        specimen.jenis_spesimen = jenis_spesimen;
                        specimen.metode_pengawetan = metode_pengawetan;
                        specimen.jumlah = jumlah;
                        specimen.deskripsi = deskripsi;
        
                        Main.clearScreen();
                        Main.greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("====================== BERHASIL MENGUBAH SPESIMEN =======================");    
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

    public static void menu_pegawai(){
        Scanner inputMenuPegawai = new Scanner(System.in);
        while (true) {
            Main.clearScreen();
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
                    employeeData();
                    Main.back();
                    break;

                case 2:
                    showSpecimen();
                    Main.back();
                    break;

                case 3:
                    addSpecimen();
                    break;
                case 4:
                    updateSpecimen();
                    break;
                case 5:
                    deleteSpecimen();
                    break;
                case 6:
                    Main.clearScreen();
                    Main.greenColor();
                    System.out.println("=========================================================================");
                    System.out.println("========================= LOGOUT BERHASIL ===============================");
                    System.out.println("=========================================================================");
                    Main.blueColor();
                    Main.delay(1000);
                    Main.main_menu();
                    break;

                default:
                    Main.None();
            }
        }
    }

    public static void deleteSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin dihapus: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();
    
                for (int i = 0; i < Specimen.spesimen.size(); i++){
                    if (Specimen.spesimen.get(i).id == id){
                        while (true){
                            Main.clearScreen();
                            Specimen.detailSpecimen(Specimen.spesimen.get(i));
                            System.out.print("\nApakah anda yakin ingin menghapus spesimen ini? (y/n): ");
                            String confirm = inputSpecimen.nextLine();

                            if (confirm.equals("n") || confirm.equals("N")){
                                Main.clearScreen();
                                Main.redColor();
                                System.out.println("=========================================================================");
                                System.out.println("======================= BATAL MENGHAPUS SPESIMEN ========================");
                                System.out.println("=========================================================================");
                                Main.blueColor();
                                Main.delay(1000);
                                return;

                            } else if (confirm.equals("y") || confirm.equals("Y")){
                                Specimen.spesimen.remove(id-1);
                
                                Main.clearScreen();
                                Main.greenColor();
                                System.out.println("=========================================================================");
                                System.out.println("====================== BERHASIL MENGHAPUS SPESIMEN ======================");    
                                System.out.println("=========================================================================");
                                Main.blueColor();
                                Main.delay(1000);
                                return;
                                
                            } else {
                                Main.clearScreen();
                                Main.None();
                                Main.delay(1000);
                            }
                        }
                    }
                }
    
                Main.clearScreen();
                Main.None();
                Main.delay(1000);
                
            } catch (Exception e){
                Main.clearScreen();
                Main.backDir();
                Main.delay(1000);
                return;
            }
        }
    }
}
