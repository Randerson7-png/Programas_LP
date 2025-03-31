package compras.passeios;

import java.util.ArrayList;
import java.util.List;

public class VendasAgenciaDeTurismo {

    public List<VendaDeTurismoIF> itens = new ArrayList<>();

    public int adicionaVenda(VendaDeTurismoIF item){
        itens.add(item);
        return itens.indexOf(item);

    }

    public double getPrecoDeVenda(int posicao){

        VendaDeTurismoIF vendaEsperada = this.itens.get(posicao);
        return vendaEsperada.getPreco();

    }

    public double getPrecoTotal(){

        double precoTotal = 0;

        for(VendaDeTurismoIF v : itens){
            precoTotal += v.getPreco();
        }

        return precoTotal;

    }

    public String listagemDeVendas(){

        String listagem = "";

        for (VendaDeTurismoIF v : itens){
            listagem += v.getDescricao() + "\n";
        }

        return  listagem;

    }

}
