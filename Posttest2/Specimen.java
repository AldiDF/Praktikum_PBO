package Posttest2;

import java.util.ArrayList;

public class Specimen {
    int id;
    String nama_spesimen;
    String nama_ilmiah;
    String jenis_spesimen;
    String metode_pengawetan;
    String tanggal_masuk;
    int jumlah;
    String deskripsi;

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
    }

    public static void detailSpecimen(Specimen spesimen){
        System.out.println("=========================================================================");
        System.out.println("========================== DETAIL SPESIMEN ==============================");
        System.out.println("=========================================================================");
        System.out.println("ID Spesimen       : " + spesimen.id);
        System.out.println("Nama Spesimen     : " + spesimen.nama_spesimen);
        System.out.println("Nama Ilmiah       : " + spesimen.nama_ilmiah);
        System.out.println("Jenis Spesimen    : " + spesimen.jenis_spesimen);
        System.out.println("Metode Pengawetan : " + spesimen.metode_pengawetan);
        System.out.println("Tanggal Masuk     : " + spesimen.tanggal_masuk);
        System.out.println("Jumlah            : " + spesimen.jumlah);
        System.out.println("Deskripsi Singkat : " + spesimen.deskripsi);
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

