package Emissores;

public class Tambor implements EmissorDeSom{
    private String tamanho;
    private String marca;

    public String getTamanho() {
        return this.tamanho;
    }

    public String getMarca() {
        return this.marca;
    }

    public Tambor(String tamanho, String marca) {
        this.tamanho = tamanho;
        this.marca = marca;
    }

    @Override
    public String emitirsom() {
        return "Tum Tum";
    }

}
