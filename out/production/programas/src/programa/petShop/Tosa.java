package programa.petShop;

import java.time.LocalDate;

public class Tosa extends ServicoPetshop{

    public Tosa(int codigo, Tamanho tamanho) {
        super(codigo, tamanho);

    }

    public double calculaPreco(){

        double preco = 0;
        if(getTamanho() == Tamanho.PEQUENO){
            preco += PrecoTosa.PEQUENO.getPreco();
        }
        else if (getTamanho() == Tamanho.MEDIO) {
            preco += PrecoTosa.MEDIO.getPreco();
        }
        else if (getTamanho() == Tamanho.GRANDE) {
            preco += PrecoTosa.GRANDE.getPreco();
        }
        return preco;
    }

    public String descricao(){
        return "Tosa em um animal" + " do tamanho" + getTamanho();
    }

}
