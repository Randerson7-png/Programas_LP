package Figuras;

public class Circulo implements Figuras2D {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
        this(0.0);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return Math.PI * (raio * raio);

    }

    @Override
    public double calculaPerimetro(){
        return 2 * raio * Math.PI;
    }

    @Override
    public String getIdentificacao() {
        return "Circulo";
    }

    @Override
    public int compareTo(Figuras2D figura) {
        return Double.compare(this.calculaArea(), figura.calculaArea() );
    }
}
