package Emissores;

public class Cachorro implements EmissorDeSom{
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String emitirsom() {
        return "Au au";
    }
}
