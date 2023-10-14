package id.its.pbo.art;

public class Lukisan extends KaryaSeni {

    public Lukisan(String judul) {
        super(judul);
    }

    public String deskripsi() {
        return "Sebuah gambar yang dilukis di atas kanvas";
    }

    public String tampilkan() {
        return "Digantung di dinding";
    }
}
