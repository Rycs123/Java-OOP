package id.its.pbo.computer;

public class Memory {
    private int kapasitas;
    private String tipeMemory;

    public Memory(int kapasitas, String tipeMemory){
        this.kapasitas = kapasitas;
        this.tipeMemory = tipeMemory;
    }

    public String getTipeMemory(){
        return this.tipeMemory;
    }

    public void setTipeMemory(String tipeMemory){
        this.tipeMemory = tipeMemory;
    }

    public int getKapasitas(){
        return this.kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }
}
