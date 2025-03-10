package Figuras;

public class FigurasMain {
    public static void main(String[] args) {

       RepositorioDeFiguras2D figuras = new RepositorioDeFiguras2D();
       figuras.adicionarFigura(new Quadrado(2));
       figuras.adicionarFigura(new Circulo(2));
       figuras.adicionarFigura(new TrianguloRegular(3));

    }
}
