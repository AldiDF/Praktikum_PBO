package BioMuseum;
public class Specimen {
    int id;
    String nama_spesimen;
    String nama_ilmiah;
    String jenis_spesimen;
    String metode_pengawetan;
    String tanggal_masuk;
    int jumlah;
    String deskripsi;

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
}
