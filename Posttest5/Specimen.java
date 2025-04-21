package Posttest5;

import java.util.ArrayList;

public final class Specimen {
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

    public void detailSpecimen(){
        System.out.println("=========================================================================");
        System.out.println("========================== DETAIL SPESIMEN ==============================");
        System.out.println("=========================================================================");
        System.out.println("ID                 : " + getId());
        System.out.println("Nama Spesimen      : " + getNamaSpesimen());
        System.out.println("Nama Ilmiah        : " + getNamaIlmiah());
        System.out.println("Jenis Spesimen     : " + getJenisSpesimen());
        System.out.println("Metode Pengawetan  : " + getMetodePengawetan());
        System.out.println("Tanggal Masuk      : " + getTanggalMasuk());
        System.out.println("Jumlah             : " + getJumlah());
        System.out.println("Deskripsi Singkat  : " + getDeskripsi());
        System.out.println("Kondisi            : " + getKondisi());
        System.out.println("Hasil Pemeriksaan  : " + getHasilPemeriksaan());
        System.out.println("Tanggal Pemeriksaan: " + getTanggalPemeriksaan());
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

