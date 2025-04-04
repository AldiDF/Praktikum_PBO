package Posttest3;

import java.util.Scanner;

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
            System.out.println("Username          : " + i.getUsername());
            System.out.println("Nama Lengkap      : " + i.getFullname());
            System.out.println("Email             : " + i.getEmail());
            System.out.println("Nomor Telepon     : " + i.getPhone());
            System.out.println("Tanggal Bergabung : " + i.getTanggalBergabung());
            System.out.println("Jabatan           : " + i.getJabatan());
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
            System.out.println("ID                 : " + i.getId());
            System.out.println("Nama Spesimen      : " + i.getNamaSpesimen());
            System.out.println("Nama Ilmiah        : " + i.getNamaIlmiah());
            System.out.println("Jenis Spesimen     : " + i.getJenisSpesimen());
            System.out.println("Metode Pengawetan  : " + i.getMetodePengawetan());
            System.out.println("Tanggal Masuk      : " + i.getTanggalMasuk());
            System.out.println("Jumlah             : " + i.getJumlah());
            System.out.println("Deskripsi Singkat  : " + i.getDeskripsi());
            System.out.println("Kondisi            : " + i.getKondisi());
            System.out.println("Hasil Pemeriksaan  : " + i.getHasilPemeriksaan());
            System.out.println("Tanggal Pemeriksaan: " + i.getTanggalPemeriksaan());
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
                    if (Specimen.spesimen.get(i).getId() == id){
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

                        String kondisi;
                        while (true) {
                            System.out.print("Masukkan kondisi (Baik/Rusak): ");
                            kondisi = inputSpecimen.nextLine().trim();
                        
                            if (kondisi.equalsIgnoreCase("Baik") || kondisi.equalsIgnoreCase("Rusak")) {
                                break;
                            } else {
                                Main.clearScreen();
                                Main.redColor();
                                System.out.println("Hanya boleh memasukkan 'Baik' atau 'Rusak'!");
                                Main.blueColor();
                                Main.delay(1000);
                            }
                        }
                    
        
                        specimen.setId(id);;
                        specimen.setNamaSpesimen(nama_spesimen);
                        specimen.setNamaIlmiah(nama_ilmiah);
                        specimen.setJenisSpesimen(jenis_spesimen);
                        specimen.setMetodePengawetan(metode_pengawetan);
                        specimen.setJumlah(jumlah);
                        specimen.setDeskripsi(deskripsi);
                        specimen.setKondisi(kondisi);
        
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
                    if (Specimen.spesimen.get(i).getId() == id){
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
