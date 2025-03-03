package Figuras;

public class Circulo implements Figuras2D {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(double raio){
        double resultado = Math.PI * (raio * raio);
        return resultado;
    }

    @Override
    public double calculaPerimetro(double raio){
        double resultado = 2 * raio * Math.PI;
        return resultado;
    }

    @Override
    public String getIdentificacao() {
        return "Circulo";
    }
}
