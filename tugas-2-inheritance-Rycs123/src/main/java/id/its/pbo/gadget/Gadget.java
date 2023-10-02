package id.its.pbo.gadget;

public class Gadget {
    private String brand;
    private int tahunRilis;
    
    public Gadget(String brand, int tahunRilis){
        this.brand = brand;
        this.tahunRilis = tahunRilis;
    }

    protected String infoGadget() {
        return "Brand: "+ this.brand + ", Tahun Rilis: " + this.tahunRilis;
    }
}
