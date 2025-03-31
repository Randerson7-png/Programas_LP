package programa.petShop;

public class Facade {
    private InventarioPetshop inventario;

    public Facade(InventarioPetshop inventario) {
        this.inventario = inventario;
    }

    public void criaBanho(int codigo, Tamanho tamanho, TamanhoPelo tamanhoPelo){
        ServicoPetshop banho = new Banho(codigo,tamanho,tamanhoPelo);
        inventario.adicionaServiso(banho);
    }

    public void hospedaNoHotelzinho(int codigo, Tamanho tamanho, int quantHoras){
        ServicoPetshop hotel = new Hotel(codigo, tamanho, quantHoras);
        inventario.adicionaServiso(hotel);
    }

    public void criaTosa(int codigo, Tamanho tamanho){
        ServicoPetshop tosa = new Tosa(codigo, tamanho);
        inventario.adicionaServiso(tosa);
    }

    public double calculaPreco(InventarioPetshop inventario){
        return inventario.calculaValorServico();
    }

    public String listarServico(InventarioPetshop inventario){
        return inventario.listaServicos();
    }

    public String getExtrato(InventarioPetshop inventario){
        return inventario.getExtrato();
    }

    public int getTamInventario(){
        return inventario.getTamanhoInventario();
    }

}
