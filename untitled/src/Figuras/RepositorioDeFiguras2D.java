package Figuras;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<Figuras2D> figuras = new ArrayList<>();

    public void adicionarFigura(Figuras2D figura){
        this.figuras.add(figura);
    }

    public void removerFigura(int posicao){
        this.figuras.remove(posicao);
    }

    public Figuras2D recuperarArea(int posicao){
        return this.figuras.get(posicao);
    }

    public Figuras2D recuperarPerimetro(int posicao){
        return this.figuras.get(posicao);
    }

    public String recuperarTipo(int posicao){
        return this.figuras.get(posicao).getIdentificacao();
    }

}
