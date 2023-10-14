package id.its.pbo.sorting;

public class Buku extends Item implements Sortable {
    private int jumlahHalaman;

    public Buku(String nama, int jumlahHalaman) {
        super(nama);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    @Override
    public int compare(Sortable object) {
        if (object instanceof Buku) {
            Buku objectBuku = (Buku) object;
            return (this.jumlahHalaman - objectBuku.jumlahHalaman);
        }
        return 0;
    }

}
