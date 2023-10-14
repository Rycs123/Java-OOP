package id.its.pbo.music;

public class StudioMusikProgram {
    public static void main(String[] args) {
        Piano piano = new Piano("Piano Grand");
        System.out.println(piano.suara());

        StudioMusik studio = new StudioMusik();
        studio.tambahInstrumen(new Gitar("Gitar Akustik"));
        studio.tambahInstrumen(new Piano("Piano Grand"));
        System.out.println(studio.mainkanInstrumen());
    }
}
