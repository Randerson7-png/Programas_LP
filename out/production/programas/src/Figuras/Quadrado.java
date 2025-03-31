package Figuras;

public class Quadrado implements Figuras2D{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado(){
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
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getIdentificacao() {
        return "Quadrado";
    }

    @Override
    public int compareTo(Figuras2D figura) {
        return Double.compare(this.calculaArea(), figura.calculaArea());
    }
}
