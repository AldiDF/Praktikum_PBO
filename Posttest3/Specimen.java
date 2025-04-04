package Posttest3;

import java.util.ArrayList;

public class Specimen {
    private int id;
    private String nama_spesimen;
    private String nama_ilmiah;
    private String jenis_spesimen;
    private String metode_pengawetan;
    private String tanggal_masuk;
    private int jumlah;
    private String deskripsi;
    private String kondisi;
    private String hasil_pemeriksaan;
    private String tanggal_pemeriksaan;

    public static ArrayList <Specimen> spesimen = new ArrayList<>();

    public Specimen(int id, String nama_spesimen, String nama_ilmiah, String jenis_spesimen, String metode_pengawetan, String tanggal_masuk, int jumlah, String deskripsi) {
        this.id = id;
        this.nama_spesimen = nama_spesimen;
        this.nama_ilmiah = nama_ilmiah;
        this.jenis_spesimen = jenis_spesimen;
        this.metode_pengawetan = metode_pengawetan;
        this.tanggal_masuk = tanggal_masuk;
        this.jumlah = jumlah;
        this.deskripsi = deskripsi;
        this.kondisi = "Baik";
        this.hasil_pemeriksaan = "-";
        this.tanggal_pemeriksaan = "-";
    }

    int getId(){
        return id;
    }

    String getNamaSpesimen(){
        return nama_spesimen;
    }

    String getNamaIlmiah(){
        return nama_ilmiah;
    }

    String getJenisSpesimen(){
        return jenis_spesimen;
    }

    String getMetodePengawetan(){
        return metode_pengawetan;
    }

    String getTanggalMasuk(){
        return tanggal_masuk;
    }

    int getJumlah(){
        return jumlah;
    }

    String getDeskripsi(){
        return deskripsi;
    }

    String getKondisi(){
        return kondisi;
    }

    String getHasilPemeriksaan(){
        return hasil_pemeriksaan;
    }

    String getTanggalPemeriksaan(){
        return tanggal_pemeriksaan;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNamaSpesimen(String nama_spesimen){
        this.nama_spesimen = nama_spesimen;
    }

    public void setNamaIlmiah(String nama_ilmiah){
        this.nama_ilmiah = nama_ilmiah;
    }

    public void setJenisSpesimen(String jenis_spesimen){
        this.jenis_spesimen = jenis_spesimen;
    }

    public void setMetodePengawetan(String metode_pengawetan){
        this.metode_pengawetan = metode_pengawetan;
    }

    public void setTanggalMasuk(String tanggal_masuk){
        this.tanggal_masuk = tanggal_masuk;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void setKondisi(String kondisi){
        this.kondisi = kondisi;
    }

    public void setHasilPemeriksaan(String hasil_pemeriksaan){
        this.hasil_pemeriksaan = hasil_pemeriksaan;
    }

    public void setTanggalPemeriksaan(String tanggal_pemeriksaan){
        this.tanggal_pemeriksaan = tanggal_pemeriksaan;
    }

    public static void detailSpecimen(Specimen spesimen){
        System.out.println("=========================================================================");
        System.out.println("========================== DETAIL SPESIMEN ==============================");
        System.out.println("=========================================================================");
        System.out.println("ID                 : " + spesimen.getId());
        System.out.println("Nama Spesimen      : " + spesimen.getNamaSpesimen());
        System.out.println("Nama Ilmiah        : " + spesimen.getNamaIlmiah());
        System.out.println("Jenis Spesimen     : " + spesimen.getJenisSpesimen());
        System.out.println("Metode Pengawetan  : " + spesimen.getMetodePengawetan());
        System.out.println("Tanggal Masuk      : " + spesimen.getTanggalMasuk());
        System.out.println("Jumlah             : " + spesimen.getJumlah());
        System.out.println("Deskripsi Singkat  : " + spesimen.getDeskripsi());
        System.out.println("Kondisi            : " + spesimen.getKondisi());
        System.out.println("Hasil Pemeriksaan  : " + spesimen.getHasilPemeriksaan());
        System.out.println("Tanggal Pemeriksaan: " + spesimen.getTanggalPemeriksaan());
        System.out.println("=========================================================================");
    }

    public static void dataSpecimen(){
        spesimen.add(new Specimen(1, "Kupu-kupu", "Lepidoptera", "Serangga", "Kering", "2021-06-01", 10, "Kupu-kupu yang sudah mati"));
        spesimen.add(new Specimen(2, "Katak", "Anura", "Amfibi", "Basah", "2021-06-02", 5, "Katak yang sudah mati"));
        spesimen.add(new Specimen(3, "Kecoa", "Blattodea", "Serangga", "Kering", "2021-06-03", 20, "Kecoa yang sudah mati"));
        spesimen.add(new Specimen(4, "Kumbang", "Coleoptera", "Serangga", "Kering", "2021-06-04", 15, "Kumbang yang sudah mati"));
        spesimen.add(new Specimen(5, "Kadal", "Squamata", "Reptil", "Basah", "2021-06-05", 3, "Kadal yang sudah mati"));
    }
}

