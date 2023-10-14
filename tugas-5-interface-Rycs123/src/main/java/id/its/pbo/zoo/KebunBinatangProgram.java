package id.its.pbo.zoo;

public class KebunBinatangProgram {
    public static void main(String[] args) {
        KebunBinatang kebun = new KebunBinatang();

        Singa singa = new Singa("Leo");
        Kuda kuda = new Kuda("Pegasus");
        Ular ular = new Ular("Python");
        kebun.tambahHewan(ular);
        kebun.tambahHewan(kuda);
        kebun.tambahHewan(singa);
        kebun.tampilkanHewanBersuara();
    }
}
