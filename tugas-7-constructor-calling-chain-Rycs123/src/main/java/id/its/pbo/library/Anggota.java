package id.its.pbo.library;

public class Anggota {
    private String nama;
    private String alamat;
    private String nomorAnggota;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = "Alamat belum diisi";
    }

    public Anggota(String nama, String alamat, String nomorAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorAnggota = nomorAnggota;
    }

    public String getInfoAnggota() {
        return this.nama + ", " + this.alamat + ", " + this.nomorAnggota;
    }
}
