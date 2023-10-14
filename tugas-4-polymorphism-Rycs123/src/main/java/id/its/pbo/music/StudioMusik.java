package id.its.pbo.music;

import java.util.ArrayList;
import java.util.List;

public class StudioMusik {
    private List<Instrumen> instrumens;

    public StudioMusik() {
        this.instrumens = new ArrayList<>();
    }

    public void tambahInstrumen(Instrumen instrumen) {
        this.instrumens.add(instrumen);
    }

    public int getInstrumenSize() {
        return this.instrumens.size();
    }

    public String mainkanInstrumen() {
        String tempInstrumen = "";
        for (int i = 0; i < getInstrumenSize() - 1; i++) {
            tempInstrumen += this.instrumens.get(i).suara() + " ";
        }
        tempInstrumen += this.instrumens.get(getInstrumenSize() - 1).suara();
        return tempInstrumen;
    }
}
