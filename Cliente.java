public class Cliente {
    private String nome;
    private CarrinhoDeCompras carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarAoCarrinho(Produto produto) throws Exception{
        carrinho.adicionarProduto(produto);
    }

    public void removerDoCarrinho(Produto produto) throws Exception{
        carrinho.removerProduto(produto);
    }

    public double finalizarCompra() throws Exception{


        // Aqui devemos verificar se o carrinho está vazio antes de finalizar a compra
        return carrinho.calcularTotal();
    }
}
