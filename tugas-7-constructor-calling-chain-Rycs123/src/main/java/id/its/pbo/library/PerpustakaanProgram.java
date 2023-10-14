package id.its.pbo.library;

import java.util.ArrayList;
import java.util.List;

public class PerpustakaanProgram {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 1997);
        Buku buku2 = new Buku("The Hobbit", "J.R.R. Tolkien", 1937);
        Anggota anggota1 = new Anggota("Alice", "A001");
        Anggota anggota2 = new Anggota("Bob", "Jl. Merdeka No.1", "B002");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);
        perpustakaan.pinjamBuku(anggota1, buku1);
        perpustakaan.pinjamBuku(anggota2, buku2);

        List<Buku> daftarBuku = new ArrayList<>();
        daftarBuku = perpustakaan.getDaftarBuku();
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getInfoBuku());
        }

        List<Anggota> daftarAnggota = new ArrayList<>();
        daftarAnggota = perpustakaan.getDaftarAnggota();
        for (Anggota anggota : daftarAnggota) {
            System.out.println(anggota.getInfoAnggota());
        }

        List<Anggota> daftarPeminjamBuku1 = new ArrayList<>();
        daftarPeminjamBuku1 = buku1.getDaftarPeminjam();
        for (Anggota anggota : daftarPeminjamBuku1) {
            System.out.println(anggota.getInfoAnggota());
        }
    }
}
