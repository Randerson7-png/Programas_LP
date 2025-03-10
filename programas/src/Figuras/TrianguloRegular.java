package Figuras;

public class TrianguloRegular implements Figuras2D{
    private double lado;

    public TrianguloRegular(double lado) {
        this.lado = lado;
    }

    public TrianguloRegular(){
        this(0.0);
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
       return (lado * lado * Math.sqrt(3)) / 4 ;
    }

    @Override
    public double calculaPerimetro() {
        return 3 * lado;
    }

    @Override
    public String getIdentificacao() {
        return "Triangulo regular";
    }

    @Override
    public int compareTo(Figuras2D figura) {
        return Double.compare(this.calculaArea(), figura.calculaArea());
    }
}
