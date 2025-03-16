package BioMuseum;
import java.util.Scanner;
public class Employee {
    String userid;
    String password;
    String fullname;
    String email;
    String phone;
    String tanggal_bergabung;
    String jabatan;

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
        for (Employee i : Main.pegawai) {
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
        
        if (Main.spesimen.isEmpty()){
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
        for (Specimen i : Main.spesimen) {
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

        if (Main.spesimen.isEmpty()){
            id = 1;

        } else {
            id = Main.spesimen.size() + 1;
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

        Main.spesimen.add(new Specimen(id, nama_spesimen, nama_ilmiah, jenis_spesimen, metode_pengawetan, Main.localTime() ,jumlah, deskripsi));

        Main.clearScreen();
        System.out.println("=========================================================================");
        System.out.println("==================== BERHASIL MENAMBAHKAN SPESIMEN ======================");
        System.out.println("=========================================================================");
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

                for (int i = 0; i < Main.spesimen.size(); i++){
                    if (Main.spesimen.get(i).id == id){
                        Specimen specimen = Main.spesimen.get(i);
        
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
                        System.out.println("=========================================================================");
                        System.out.println("====================== BERHASIL MENGUBAH SPESIMEN =======================");    
                        System.out.println("=========================================================================");
                        Main.delay(1000);
                        return;
                    }
                }
                Main.clearScreen();
                System.out.println("=========================================================================");
                System.out.println("======================= ID SPESIMEN TIDAK DITEMUKAN =====================");
                System.out.println("=========================================================================");
                Main.delay(1000);

            } catch(Exception e){ 
                Main.clearScreen();
                System.out.println("=========================================================================");
                System.out.println("================================= KEMBALI ===============================");
                System.out.println("=========================================================================");
                Main.delay(1000);
                return;
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
    
                for (int i = 0; i < Main.spesimen.size(); i++){
                    if (Main.spesimen.get(i).id == id){
                        while (true){
                            Main.clearScreen();
                            Specimen.detailSpecimen(Main.spesimen.get(i));
                            System.out.print("\nApakah anda yakin ingin menghapus spesimen ini? (y/n): ");
                            String confirm = inputSpecimen.nextLine();

                            if (confirm.equals("n") || confirm.equals("N")){
                                Main.clearScreen();
                                System.out.println("=========================================================================");
                                System.out.println("======================= BATAL MENGHAPUS SPESIMEN ========================");
                                System.out.println("=========================================================================");
                                Main.delay(1000);
                                return;

                            } else if (confirm.equals("y") || confirm.equals("Y")){
                                Main.spesimen.remove(id-1);
                
                                Main.clearScreen();
                                System.out.println("=========================================================================");
                                System.out.println("====================== BERHASIL MENGHAPUS SPESIMEN ======================");    
                                System.out.println("=========================================================================");
                                Main.delay(1000);
                                return;
                                
                            } else {
                                Main.clearScreen();
                                System.out.println("=========================================================================");
                                System.out.println("=========================== PILIHAN TIDAK ADA ===========================");
                                System.out.println("=========================================================================");
                                Main.delay(1000);
                            }
                        }
                    }
                }
    
                Main.clearScreen();
                System.out.println("=========================================================================");
                System.out.println("======================= ID SPESIMEN TIDAK DITEMUKAN =====================");
                System.out.println("=========================================================================");
                Main.delay(1000);
                
            } catch (Exception e){
                Main.clearScreen();
                System.out.println("=========================================================================");
                System.out.println("================================= KEMBALI ===============================");
                System.out.println("=========================================================================");
                Main.delay(1000);
                return;
            }
        }
    }
}
