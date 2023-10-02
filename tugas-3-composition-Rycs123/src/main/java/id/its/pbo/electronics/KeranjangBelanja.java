package id.its.pbo.electronics;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<ItemBelanja> daftarItemBelanja = new ArrayList<ItemBelanja>();

    public void tambahProduk(Produk produk, int kuantitas) {
        ItemBelanja item = new ItemBelanja(produk, kuantitas);
        daftarItemBelanja.add(item);
    }

    public double hitungTotalBelanja() {
        double totalBelanja = 0;
        for (ItemBelanja item : daftarItemBelanja) {
            totalBelanja += item.hitungTotal();
        }
        return totalBelanja;
    }
}
