package id.its.pbo.sorting;

public class Sepatu extends Item implements Sortable {
    private int ukuran;

    public Sepatu(String nama, int ukuran) {
        super(nama);
        this.ukuran = ukuran;
    }

    @Override
    public int compare(Sortable object) {
        if (object instanceof Sepatu) {
            Sepatu objectSepatu = (Sepatu) object;
            return (this.ukuran - objectSepatu.ukuran);
        }
        return 0;
    }
}
