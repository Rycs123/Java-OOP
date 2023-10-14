package id.its.pbo.art;

import java.util.ArrayList;
import java.util.List;

public class StudioSeni {
    private List<KaryaSeni> daftarKaryaSeni;

    public StudioSeni() {
        this.daftarKaryaSeni = new ArrayList<>();
    }

    public void tambahKaryaSeni(KaryaSeni karyaSeni) {
        this.daftarKaryaSeni.add(karyaSeni);
    }

    public int tambahKaryaSeni() {
        return this.daftarKaryaSeni.size();
    }

    public List<String> tampilkanSemuaKarya() {
        List<String> tampilkanKarya = new ArrayList<>();
        for (KaryaSeni karyaSeni : this.daftarKaryaSeni) {
            tampilkanKarya.add(karyaSeni.tampilkan());
        }
        return tampilkanKarya;
    }
}
