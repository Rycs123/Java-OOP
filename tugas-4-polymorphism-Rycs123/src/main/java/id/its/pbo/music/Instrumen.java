package id.its.pbo.music;

public abstract class Instrumen {
    private String nama;

    public Instrumen(String nama) {
        this.nama = nama;
    }

    public abstract String suara();
}
