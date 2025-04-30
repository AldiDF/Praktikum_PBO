package Posttest6;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// Judul Tema : Sistem Informasi Manajemen Spesimen Museum Biologi "BioMuseum" Berbasis Website
public class Main {
    public static ArrayList <Employee> pegawai = new ArrayList<>();
    public static ArrayList <Visitor> pengunjung = new ArrayList<>();
    public static ArrayList <Specialist> spesialis = new ArrayList<>();

    public static void main(String[] args){
        Employee.dataEmployee();
        Visitor.dataVisitor();
        Specimen.dataSpecimen();
        Specialist.dataSpecialist();
        blueColor();
        Main menuUtama = new Main();
        menuUtama.main_menu();
    }

    public void main_menu(){
        Scanner input = new Scanner(System.in);
        while (true){
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("====================== SELAMAT DATANG DI BIOMUSEUM ======================");
            System.out.println("=========================================================================");
            delay(1000);
            
            System.out.println("\n============= PEGAWAI =============");
            System.out.println("[1] Login Sebagai Pegawai");
            System.out.println("[2] Register Sebagai Pegawai");
            System.out.println("===================================");
            
            System.out.println("\n============ SPESIALIS ============");
            System.out.println("[3] Login Sebagai Spesialis");
            System.out.println("[4] Register Sebagai Spesialis");
            System.out.println("===================================");
            
            System.out.println("\n============ PENGUNJUNG ===========");
            System.out.println("[5] Login Sebagai Pengunjung");
            System.out.println("[6] Register Sebagai Pengunjung");
            System.out.println("===================================");

            System.out.println("\n[7] Exit");
            System.out.print("\nMasukkan pilihan: ");
            try {
                int menu = input.nextInt();
                input.nextLine();
                switch (menu) {
                    case 1:
                        loginPegawai();
                        break;

                    case 2:
                        registerPegawai();
                        break;

                    case 3:
                        loginSpesialis();
                        break;

                    case 4:
                        registerSpesialis();
                        break;

                    case 5:
                        loginPengunjung();
                        break;

                    case 6:
                        registerPengunjung();
                        break;

                    case 7:
                        clearScreen();
                        greenColor();
                        System.out.println("Terima kasih telah mengunjungi BIOMUSEUM");
                        System.exit(0);
                        break;

                    default:
                    clearScreen();
                    None();
                    delay(1000);
                }
                 
            } catch (Exception e) {
                clearScreen();
                None();
                delay(1000);
                main_menu();
            }
            
        }
    }

    public void loginPegawai(){
        Scanner inputLogin = new Scanner(System.in);

        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("============================= LOGIN PEGAWAI =============================");
        System.out.println("=========================================================================");
        System.out.print("\nMasukkan username: ");
        String username = inputLogin.nextLine();
        System.out.print("Masukkan password: ");
        String password = inputLogin.nextLine();

        Employee employee = new Employee(username, password, null, null, null, null, null);

        if (employee.verifyLogin(username, password)){
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("========================= LOGIN BERHASIL ================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
            menuUser();

        } else {
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================== LOGIN GAGAL ==================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }
    }

    public void registerPegawai(){
        Scanner inputRegister = new Scanner(System.in);
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== REGISTER PEGAWAI ============================");
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
        
        Employee employee = new Employee(username, password, fullname, email, phone, localTime(), jabatan);

        if (employee.verifyRegister(username)){
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================= USERNAME SUDAH ADA ============================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);

        } else {
            pegawai.add(employee);
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("====================== REGISTER PEGAWAI BERHASIL ========================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }
    }

    public void loginPengunjung(){
        Scanner inputLogin = new Scanner(System.in);
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== LOGIN PENGUNJUNG ============================");
        System.out.println("=========================================================================");
        System.out.print("\nMasukkan username: ");
        String username = inputLogin.nextLine();
        System.out.print("Masukkan password: ");
        String password = inputLogin.nextLine();

        Visitor visitor = new Visitor(username, password, null, null, null, null);
        
        if (visitor.verifyLogin(username, password)){
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("========================= LOGIN BERHASIL ================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
            menuUser(username);
        
        } else {
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================== LOGIN GAGAL ==================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }   
    }

    public void registerPengunjung(){
        Scanner inputRegister = new Scanner(System.in);
        clearScreen();
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

        Visitor visitor = new Visitor(username, password, fullname, email, phone, domisili);

        if (visitor.verifyRegister(username)){
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================= USERNAME SUDAH ADA ============================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
            
        } else {
            pengunjung.add(visitor);
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("==================== REGISTER PENGUNJUNG BERHASIL =======================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }
    }

    public void loginSpesialis(){
        Scanner inputLogin = new Scanner(System.in);
        
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("============================ LOGIN SPESIALIS ============================");
        System.out.println("=========================================================================");
        System.out.print("\nMasukkan username: ");
        String username = inputLogin.nextLine();
        System.out.print("Masukkan password: ");
        String password = inputLogin.nextLine();

        Specialist specialist = new Specialist(username, password, null, null, null, null, null);
        
        if (specialist.verifyLogin(username, password)){
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("========================= LOGIN BERHASIL ================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
            menu_spesialis(username);

        } else {
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================== LOGIN GAGAL ==================================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }
    }

    public void registerSpesialis(){
        Scanner inputRegister = new Scanner(System.in);
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== REGISTER SPESIALIS ==========================");
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

        Specialist specialist = new Specialist(username, password, fullname, email, phone, keahlian, institusi);

        if (specialist.verifyRegister(username)){
            clearScreen();
            redColor();
            System.out.println("=========================================================================");
            System.out.println("========================= USERNAME SUDAH ADA ============================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
            
        } else {
            spesialis.add(specialist);
            clearScreen();
            greenColor();
            System.out.println("=========================================================================");
            System.out.println("==================== REGISTER SPESIALIS BERHASIL ========================");
            System.out.println("=========================================================================");
            blueColor();
            delay(1000);
        }
    }

    public void menuUser(){
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
            try{
                int menu = inputMenuPegawai.nextInt();
                inputMenuPegawai.nextLine();
                switch (menu) {
                    case 1:
                        employeeData();
                        back();
                        break;

                    case 2:
                        showSpecimen();
                        back();
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
                        clearScreen();
                        greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("========================= LOGOUT BERHASIL ===============================");
                        System.out.println("=========================================================================");
                        blueColor();
                        delay(1000);
                        main_menu();
                        break;

                    default:
                        None();
                }

            } catch (Exception e){
                clearScreen();
                None();
                delay(1000);
                menuUser();
            }
            
        }
    }

    public void employeeData(){
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("====================== TAMPILKAN DATA PEGAWAI ===========================");
        System.out.println("=========================================================================");
        delay(1000);
        clearScreen();

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

    public void showSpecimen(){
        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("====================== TAMPILKAN DATA SPESIMEN ==========================");
        System.out.println("=========================================================================");
        delay(1000);
        
        if (Specimen.spesimen.isEmpty()){
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("======================= DATA SPESIMEN KOSONG ============================");
            System.out.println("=========================================================================");
            delay(1000);
            return;
        }
        
        clearScreen();
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

    public void addSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        int id;

        clearScreen();
        System.out.println("=========================================================================");
        System.out.println("=========================== TAMBAH SPESIMEN =============================");
        System.out.println("=========================================================================");
        delay(1000);

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

        Specimen.spesimen.add(new Specimen(id, nama_spesimen, nama_ilmiah, jenis_spesimen, metode_pengawetan, localTime() ,jumlah, deskripsi));

        clearScreen();
        greenColor();
        System.out.println("=========================================================================");
        System.out.println("==================== BERHASIL MENAMBAHKAN SPESIMEN ======================");
        System.out.println("=========================================================================");
        blueColor();
        delay(1000);
    }

    public void updateSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin diubah: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();

                for (Specimen i : Specimen.spesimen){
                    if (i.getId() == id){
                        clearScreen();
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
                                clearScreen();
                                redColor();
                                System.out.println("Hanya boleh memasukkan 'Baik' atau 'Rusak'!");
                                blueColor();
                                delay(1000);
                            }
                        }

                        i.setNamaSpesimen(nama_spesimen);
                        i.setNamaIlmiah(nama_ilmiah);
                        i.setJenisSpesimen(jenis_spesimen);
                        i.setMetodePengawetan(metode_pengawetan);
                        i.setJumlah(jumlah);
                        i.setDeskripsi(deskripsi);
                        i.setKondisi(kondisi);
                        clearScreen();
                        greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("====================== BERHASIL MENGUBAH SPESIMEN =======================");    
                        System.out.println("=========================================================================");
                        blueColor();
                        delay(1000);
                        return;
                    }
                }
        
                clearScreen();
                None();
                delay(1000);

            } catch(Exception e){ 
                clearScreen();
                back("KEMBALI");
                delay(1000);
                return;
            }
        }
    }

    public void deleteSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin dihapus: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();
                
                for (Specimen i : Specimen.spesimen){
                    if (i.getId() == id){
                        while (true){
                            clearScreen();
                            i.detailSpecimen();
                            System.out.print("\nApakah anda yakin ingin menghapus spesimen ini? (y/n): ");
                            String confirm = inputSpecimen.nextLine();

                            if (confirm.equals("n") || confirm.equals("N")){
                                clearScreen();
                                redColor();
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
                Main.back("KEMBALI");
                Main.delay(1000);
                return;
            }
        }
    }

    public void menuUser(String session){    
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
            try{
                int menu = inputMenu.nextInt();
                inputMenu.nextLine();
                switch (menu) {
                    case 1:
                        showSpecimen();
                        back();
                        break;

                    case 2:
                        for (Visitor i : pengunjung){ 
                            if (i.userid.equals(session)){
                                i.selfData();
                            }
                        }
                        back();
                        break;

                    case 3:
                        updateData(session);
                        break;

                    case 4:
                        clearScreen();
                        greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("=========================== LOGOUT BERHASIL =============================");
                        System.out.println("=========================================================================");
                        blueColor();
                        delay(1000);
                        main_menu();
                        break;

                    default:
                    clearScreen();
                    None();
                    delay(1000);
                }

            } catch (Exception e){
                clearScreen();
                None();
                delay(1000);
                menuUser(session);
            }            
        }
    }

    public void updateData(String session){
        Scanner inputUpdate = new Scanner(System.in);
        
        for (Visitor i : Main.pengunjung) {
            if (i.userid.equals(session)){
                i.selfData();
            }
        }

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

                clearScreen();
                greenColor();
                System.out.println("=========================================================================");
                System.out.println("======================== BERHASIL MENGUBAH DATA =========================");    
                System.out.println("=========================================================================");
                blueColor();
                delay(1000);
            }
        }
    }

    public void menu_spesialis(String session){
        Scanner inputMenu = new Scanner(System.in);
        while (true){
            clearScreen();
            System.out.println("=========================================================================");
            System.out.println("============================ MENU SPESIALIS =============================");
            System.out.println("=========================================================================");
            System.out.println("\n[1] Lihat Daftar Spesimen");
            System.out.println("[2] Periksa Spesimen");
            System.out.println("[3] Lihat Data Diri");
            System.out.println("[4] Logout");
            System.out.print("\nMasukkan pilihan: ");
            try{
                int menu = inputMenu.nextInt();
                inputMenu.nextLine();
        
                switch (menu) {
                    case 1:
                        showSpecimen();
                        back();
                        break;

                    case 2:
                        monitoringSpecimen();
                        break;

                    case 3:
                        for (Specialist i : spesialis){ 
                            if (i.userid.equals(session)){
                                i.selfData();
                            }
                        }
                        back();
                        break;

                    case 4:
                        clearScreen();
                        greenColor();
                        System.out.println("=========================================================================");
                        System.out.println("=========================== LOGOUT BERHASIL =============================");
                        System.out.println("=========================================================================");
                        blueColor();
                        delay(1000);
                        main_menu();
                        break;

                    default:
                    clearScreen();
                    None();
                    delay(1000);
                }

            } catch (Exception e){
                clearScreen();
                None();
                delay(1000);
                menu_spesialis(session);
            }
            
        }
    }

    public void monitoringSpecimen(){
        Scanner inputSpecimen = new Scanner(System.in);
        
        while (true){
            showSpecimen();
            System.out.println("\nTekan Huruf -> Kembali");
            System.out.print("Masukkan ID Spesimen yang ingin diperiksa: ");
            try {
                int id = inputSpecimen.nextInt();
                inputSpecimen.nextLine();

                for (Specimen i : Specimen.spesimen){
                    if (i.getId() == id){
                        Main.clearScreen();
                        i.detailSpecimen();
                        System.out.println("\nBerikan rekomendasi pada spesimen ini untuk dilakukan");
                        System.out.println("perawatan lebih lanjut oleh pihak museum");
                        System.out.print("\nMasukkan Hasil Pemeriksaan: ");
                        String hasil_pemeriksaan = inputSpecimen.nextLine();
                        
                        i.setKondisi("Selesai Diperiksa");
                        i.setHasilPemeriksaan(hasil_pemeriksaan);
                        i.setTanggalPemeriksaan(Main.localTime());
        
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
                Main.back("KEMBALI");
                Main.delay(1000);
                return;
            }
        }
    }


    public static final void clearScreen(){
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

    public static void back(String kembali){
        greenColor();
        System.out.println("=========================================================================");
        System.out.println("================================= " + kembali + " ===============================");
        System.out.println("=========================================================================");
        blueColor();
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
    
    public static final void blueColor(){
        System.out.print("\033[0;34m");
    }

    public static final void redColor(){
        System.out.print("\033[0;31m");
    }

    public static final void greenColor(){
        System.out.print("\033[0;32m");
    }
}