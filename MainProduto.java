public class MainProduto {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria");
        Produto produto1 = new Produto("Laptop", 3000.0);
        Produto produto2 = new Produto("Mouse", 150.0);
        Produto produto3 = new Produto("Fone", 150.0);


        // Aqui devemos tratar possíveis exceções ao adicionar e remover produtos

        try{
            cliente.adicionarAoCarrinho(produto1);
            cliente.adicionarAoCarrinho(produto2);
            cliente.removerDoCarrinho(produto3);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Total da compra: " + cliente.finalizarCompra());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}


