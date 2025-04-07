package programa.petShop;

public class Facade {
    private InventarioPetshop inventario;

    public Facade(InventarioPetshop inventario) {
        this.inventario = inventario;
    }

    public Banho criaBanho(int codigo, Tamanho tamanho, TamanhoPelo tamanhoPelo){
        Banho banho = new Banho(codigo,tamanho,tamanhoPelo);
        inventario.adicionaServiso(banho);
        return banho;
    }

    public Hotel hospedaNoHotelzinho(int codigo, Tamanho tamanho, int quantHoras){
        Hotel hotel = new Hotel(codigo, tamanho, quantHoras);
        inventario.adicionaServiso(hotel);
        return hotel;
    }

    public Tosa criaTosa(int codigo, Tamanho tamanho){
        Tosa tosa = new Tosa(codigo, tamanho);
        inventario.adicionaServiso(tosa);
        return tosa;
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

    public String inventarioListarServicos(){
        return inventario.listaServicos();
    }

    public String inventarioExtrato(){
        return inventario.getExtrato();
    }

    public void adicionaNoInventario(ServicoPetshop servico){
        inventario.adicionaServiso(servico);
    }

}
