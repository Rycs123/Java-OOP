package id.its.pbo.computer;

public class Komputer {
    private Processor processor;
    private Memory memory;

    public Komputer(Processor processor, Memory memory){
        this.processor = processor;
        this.memory = memory;
    }

    public Processor getProcessor(){
        return this.processor;
    }

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public Memory getMemory(){
        return this.memory;
    }

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public String infoKomputer (){
        return "Processor Brand: " + processor.getBrand() + ", Kecepatan: "+ processor.getKecepatan() +" GHz, Memory Kapasitas: "+ memory.getKapasitas() + " GB, Tipe: " + memory.getTipeMemory();
    }
}
