package Emissores;

import java.util.ArrayList;
import java.util.List;

public class CaixaDeSom {
    private List<EmissorDeSom>  emissores = new ArrayList<>();

    public void adicionarEmissor(EmissorDeSom emissor){
        this.emissores.add(emissor);
    }

    public List<EmissorDeSom> getEmissores() {
        return emissores;
    }

    public void tocarTodosOsEmissores(){

        for(EmissorDeSom e : emissores){
            System.out.println(e.emitirsom());
        }

    }

}
