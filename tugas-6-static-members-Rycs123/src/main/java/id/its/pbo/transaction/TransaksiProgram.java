package id.its.pbo.transaction;

public class TransaksiProgram {
    public static void main(String[] args) {

        Transaksi t1 = new Transaksi(100.50);
        Transaksi t2 = new Transaksi(200.75);
        Transaksi t3 = new Transaksi(50.25);

        System.out.println(t1.getTransaksiID());
        System.out.println(t2.getTransaksiID());
        System.out.println(t3.getTransaksiID());

        Transaksi.resetCounter();

        int initialCount = Transaksi.getTotalTransaksi();
        System.out.println(initialCount);

        new Transaksi(100.50);
        new Transaksi(200.75);
        new Transaksi(50.25);
        System.out.println(Transaksi.getTotalTransaksi());

        Transaksi.resetCounter();

        new Transaksi(100.50);
        new Transaksi(200.75);
        System.out.println(Transaksi.getTotalTransaksi());

    }
}
