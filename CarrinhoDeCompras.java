
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) throws Exception{

        if(produto == null){
            throw new Exception("Não é possivel adicionar um produto nulo!");
        }
        // Aqui devemos verificar se o produto é nulo e lançar uma exceção
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) throws Exception {
        if(!produtos.contains(produto)){
            throw new Exception("Não é possivel remover um produto quee não está no carrinho!");
        }
        // Aqui devemos verificar se o produto está no carrinho antes de removê-lo
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
