package programa.petShop;

public enum PrecoBanho {
    PEQUENO(50),
    MEDIO(60),
    GRANDE(70);

    private double valor;

    PrecoBanho(double precoPorTamanho) {
        this.valor = precoPorTamanho;
    }

    public double getValor() {
        return valor;
    }

}
