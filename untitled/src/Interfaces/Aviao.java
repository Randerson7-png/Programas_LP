package Interfaces;

public class Aviao implements Voador{
    private String modelo;
    private int ano;

    public Aviao(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa avião");
        return true;
    }

    @Override
    public void planar() {
        System.out.println("Plana avião");

    }

    @Override
    public double voar() {
        System.out.println("Decola avião");
        return 0;
    }
}
