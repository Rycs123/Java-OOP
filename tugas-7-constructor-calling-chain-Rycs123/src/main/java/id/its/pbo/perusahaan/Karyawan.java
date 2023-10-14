package id.its.pbo.perusahaan;

public class Karyawan {
    private String id;
    private String nama;

    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getId() {
        return this.id;
    }
}
