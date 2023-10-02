package id.its.pbo.electronics;

public class ItemBelanja {
    private Produk produk;
    private int kuantitas;

    public ItemBelanja(Produk produk, int kuantitas) {
        this.produk = produk;
        this.kuantitas = kuantitas;
    }

    public double hitungTotal() {
        return produk.getHarga() * kuantitas;
    }
}
