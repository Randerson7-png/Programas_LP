package Figuras;

public class Circulo implements Figuras2D {
    private double raio;


    public Circulo(double raio) {
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

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
