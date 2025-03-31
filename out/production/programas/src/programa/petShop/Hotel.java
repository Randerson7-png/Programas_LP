package programa.petShop;

import java.time.LocalDate;

public class Hotel extends ServicoPetshop{

    private  int quantHrs;

    public Hotel(int codigo, Tamanho tamanho, int quantHrs) {
        super(codigo, tamanho);
        this.quantHrs = quantHrs;

    }

    public int getQuantHrs() {
        return quantHrs;
    }

    public void setQuantHrs(int quantHrs) {
        this.quantHrs = quantHrs;
    }

    public double calculaPreco() {
        double preco = 0;

        if(getTamanho() == Tamanho.PEQUENO){
            preco += PrecoHotel.PEQUENO.getPreco();
        }
        else if (getTamanho() == Tamanho.MEDIO) {
            preco += PrecoHotel.MEDIO.getPreco();
        }
        else if (getTamanho() == Tamanho.GRANDE) {
            preco += PrecoHotel.GRANDE.getPreco();
        }

        return preco * getQuantHrs();

    }


    public String descricao(){
        return "Hospede é um animal " + getTamanho() + "que vai ficar por " + getQuantHrs() + "horas";
    }


}
