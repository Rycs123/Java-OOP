package id.its.pbo.art;

public class StudioSeniProgram {
    public static void main(String[] args) {
        StudioSeni studio = new StudioSeni();
        studio.tambahKaryaSeni(new Lukisan("Lukisan Alam"));
        studio.tambahKaryaSeni(new Patung("Patung Kuda"));

        System.out.println(studio.tampilkanSemuaKarya().size());
        System.out.println(studio.tampilkanSemuaKarya().get(0));
        System.out.println(studio.tampilkanSemuaKarya().get(1));

    }
}
