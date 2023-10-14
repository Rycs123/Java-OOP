package id.its.pbo.zoo;

public class KebunBinatangProgram {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Tom");
        System.out.println(kucing.getNama());
        System.out.println(kucing.buatSuara());

        Hewan anjing = new Anjing("Spike");
        System.out.println(anjing.getNama());
        System.out.println(anjing.buatSuara());
    }
}
