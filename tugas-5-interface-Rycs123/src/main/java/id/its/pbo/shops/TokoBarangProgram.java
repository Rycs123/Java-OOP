package id.its.pbo.shops;

public class TokoBarangProgram {
    public static void main(String[] args) {
        MobilListrik mobil = new MobilListrik("Tesla");
        KipasAngin kipas = new KipasAngin("Maspion");
        Televisi tv = new Televisi("Samsung");
        System.out.println(ElectricityProvider.supplyPower(tv));
        System.out.println(ElectricityProvider.supplyPower(kipas));
        System.out.println(ElectricityProvider.supplyPower(mobil));

    }
}
