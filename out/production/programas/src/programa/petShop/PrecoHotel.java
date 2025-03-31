package programa.petShop;

public enum PrecoHotel {
    PEQUENO(12),
    MEDIO(18),
    GRANDE(25);

    private double preco;

    PrecoHotel(double precoPorTamanho) {
        this.preco = precoPorTamanho;
    }

    public double getPreco() {
        return preco;
    }
}
