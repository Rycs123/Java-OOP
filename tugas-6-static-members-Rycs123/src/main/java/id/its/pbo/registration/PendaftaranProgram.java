package id.its.pbo.registration;

public class PendaftaranProgram {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Ali");
        Mahasiswa m2 = new Mahasiswa("Budiono");
        System.out.println(m1.getNomorPendaftaran());
        System.out.println(m2.getNomorPendaftaran());
        Mahasiswa m3 = new Mahasiswa("Budi");
        Mahasiswa m4 = new Mahasiswa("Karya");
        System.out.println(m3.getNomorPendaftaran());
        System.out.println(m4.getNomorPendaftaran());
        Mahasiswa m5 = new Mahasiswa("Sudirman");
        System.out.println(m5.getNomorPendaftaran());
        Mahasiswa.resetRegistrantCounter();
        System.out.println(Mahasiswa.getTotalRegistrant());
    }
}
