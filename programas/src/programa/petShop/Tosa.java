package programa.petShop;

import java.time.LocalDate;

public class Tosa extends ServicoPetshop{

    public Tosa(int codigo, Tamanho tamanho) {
        super(codigo, tamanho);

    }

    public double calculaPreco(){
        double preco = 0;
        if(getTamanho() == Tamanho.PEQUENO){
            preco+= 30;
        }
        else if (getTamanho() == Tamanho.MEDIO) {
            preco += 40;
        }
        else if (getTamanho() == Tamanho.GRANDE) {
            preco += 50;
        }
        return preco;
    }

    public String descricao(){
        return "Tosa em um animal" + " do tamanho" + getTamanho();
    }

}
