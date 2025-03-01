package Interfaces;

public class Aviao implements Voador{
    private String modelo;
    private int ano;

    public Aviao(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa drone");
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
