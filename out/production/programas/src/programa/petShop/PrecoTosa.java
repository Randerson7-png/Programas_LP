package programa.petShop;

public enum PrecoTosa {
    PEQUENO(30),
    MEDIO(40),
    GRANDE(50);

    private double preco;

    PrecoTosa(double precoPorTamanho) {
        this.preco = precoPorTamanho;
    }

    public double getPreco() {
        return preco;
    }
}
