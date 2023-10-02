package id.its.pbo.computer;

public class Processor {
    private String brand;
    private double kecepatan;

    public Processor(String brand,  double kecepatan){
        this.brand = brand;
        this.kecepatan = kecepatan;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public double getKecepatan(){
        return this.kecepatan;
    }

    public void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
}
