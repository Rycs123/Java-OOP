package id.its.pbo;

public class InvoiceProgram {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("01", "Asus", 0, 15);
        Invoice invoice2 = new Invoice("02", "MSI", 10, 15);
        invoice1.getInvoiceAmount();
        invoice2.getInvoiceAmount();
    }
}
