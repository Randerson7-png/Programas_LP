package Figuras;

public class Quadrado implements Figuras2D{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(double valorDoLado){
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public double calculaPerimetro(double ValorDoLado){
        double resultado = 4 * lado;
        return resultado;
    }

    @Override
    public String getIdentificacao() {
        return "Quadrado";
    }


}
