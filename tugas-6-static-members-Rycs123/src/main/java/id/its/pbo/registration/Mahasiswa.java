package id.its.pbo.registration;

public class Mahasiswa {
    private static int registrantCounter;
    private int nomorPendaftaran;
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
        registrantCounter++;
        this.nomorPendaftaran = registrantCounter;
    }

    public int getNomorPendaftaran() {
        return this.nomorPendaftaran;
    }

    public static int getTotalRegistrant() {
        return registrantCounter;
    }

    public static void resetRegistrantCounter() {
        registrantCounter = 0;
    }

}
