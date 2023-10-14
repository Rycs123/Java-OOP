package id.its.pbo.perusahaan;

public class Perusahaan {
    public static void main(String[] args) {
        Direktur direktur = new Direktur("Alice", "D001", "Teknologi", 20000000.0);
        System.out.println(direktur.getNama());
        System.out.println(direktur.getId());
        System.out.println(direktur.getDepartemen());
        System.out.println(direktur.getGaji());
    }
}
