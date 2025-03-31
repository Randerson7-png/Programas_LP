package programa.petShop;


import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {

    private List<ServicoPetshopIF> servicos = new ArrayList<>();


    public void adicionaServiso(ServicoPetshop serviso){
        servicos.add(serviso);
    }

    public double calculaValorServico(){
        double preco = 0;

        for(ServicoPetshopIF s : servicos){
            preco += s.calculaPreco();
        }
        return preco;
    }

    public String listaServicos(){
        String lista = "";
        for (ServicoPetshopIF s : servicos ){
            lista += s.descricao() + "\n";
        }
        return lista;
    }

    public String getExtrato(){

        String extrato = "Extrato: \n";
        double total = 0;
        for(ServicoPetshopIF s : servicos){
            extrato += "Serviço " + servicos.indexOf(s) + ": ";
            extrato += s.calculaPreco() + "\n";
            total += s.calculaPreco();
        }
        extrato += "---------------\n";
        extrato+= "Total: " + total + "$\n";

        return extrato;
    }

    public int getTamanhoInventario(){
        return servicos.size();
    }


}
