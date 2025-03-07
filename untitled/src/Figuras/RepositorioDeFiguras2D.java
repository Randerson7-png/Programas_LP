package Figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RepositorioDeFiguras2D that = (RepositorioDeFiguras2D) o;
        return Objects.equals(figuras, that.figuras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(figuras);
    }

    @Override
    public String
    toString() {
        return "RepositorioDeFiguras2D{" +
                "figuras=" + figuras +
                '}';
    }


}
