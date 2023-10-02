package id.its.pbo.store;

public class TokoBukuProgram {
    public static void main(String[] args) {
        TokoBuku toko = new TokoBuku();
        Buku buku = new Buku("1234567890", "Harry Potter", 150000);
        toko.tambahBuku(buku);
    }
}
