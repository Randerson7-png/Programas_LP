package compras.passeios;

import java.util.Objects;

public class CartaoDeMetro implements  VendaDeTurismoIF{
    private int getQtdeViagens;
    private final double VALOR_DE_UMA_VIAGEM = 7.0;

    public CartaoDeMetro(int quantidadeDeViagens) throws Exception {

        if(quantidadeDeViagens == 0 || quantidadeDeViagens < 0){
            throw new Exception("Quantidade de viagens deve ser maior que zero");
        }
        this.getQtdeViagens = quantidadeDeViagens;

    }



    public int getQtdeViagens() {
        return getQtdeViagens;
    }

    public void setQtdeViagens(int getQtdeViagens) {
        this.getQtdeViagens = getQtdeViagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartaoDeMetro that = (CartaoDeMetro) o;
        return getQtdeViagens == that.getQtdeViagens;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getQtdeViagens);
    }

    @Override
    public String toString() {
        return "CartaoDeMetro{" +
                "quantidadeDeViagens=" + getQtdeViagens +
                '}';
    }

    @Override
    public double getPreco() {

        double preco;
        if(getQtdeViagens >= 20){
            preco = (getQtdeViagens * VALOR_DE_UMA_VIAGEM) - ((getQtdeViagens * VALOR_DE_UMA_VIAGEM) * 0.2);
        } else {
            preco = getQtdeViagens * VALOR_DE_UMA_VIAGEM;
        }
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Quantidade de viagens: " + getQtdeViagens;
    }

    @Override
    public int compareTo(VendaDeTurismoIF venda) {

        return Double.compare(this.getPreco(), venda.getPreco());
    }
}
