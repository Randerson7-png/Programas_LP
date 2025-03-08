package Emissores;

public class TestaCaixaDeSom {
    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Max"));
        caixa.adicionarEmissor(new Tambor("Grande", "Yamaha"));
        caixa.tocarTodosOsEmissores();
    }
}
