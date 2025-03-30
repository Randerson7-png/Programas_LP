package programa.petShop;

import java.time.LocalDate;
import java.util.Objects;

public class Banho extends ServicoPetshop{

    private TamanhoPelo tamanhoPelo;

    public Banho(int codigo, Tamanho tamanho, TamanhoPelo tamanhoPelo) {
        super(codigo, tamanho);
        this.tamanhoPelo = tamanhoPelo;

    }

    public double calculaPreco(){
        double preco = 0;

        if(getTamanho() == Tamanho.PEQUENO){
            preco = PrecoBanho.PEQUENO.getValor();
            if(getTamanhoPelo() == TamanhoPelo.CURTO){
                preco += 0;
            }
            else if (getTamanhoPelo() == TamanhoPelo.MEDIO) {
                preco += 15;
            }
            else if (getTamanhoPelo() == TamanhoPelo.LONGO){
                preco += 25;
            }
        }
        else if (getTamanho() == Tamanho.MEDIO) {
            preco = PrecoBanho.MEDIO.getValor();
            if(getTamanhoPelo() == TamanhoPelo.CURTO){
                preco += 0;
            }
            else if (getTamanhoPelo() == TamanhoPelo.MEDIO) {
                preco += 15;
            }
            else if (getTamanhoPelo() == TamanhoPelo.LONGO) {
                preco += 25;
            }
        }
        else if (getTamanho() == Tamanho.GRANDE) {
            preco = PrecoBanho.GRANDE.getValor();
            if(getTamanhoPelo() == TamanhoPelo.CURTO){
                preco += 0;
            }
            else if (getTamanhoPelo() == TamanhoPelo.MEDIO) {
                preco += 15;
            }
            else if (getTamanhoPelo() == TamanhoPelo.LONGO) {
                preco += 25;
            }
        }
        return preco;
    }

    public String descricao(){
        return "Banho em um animal" + getTamanho() + " com pelos" + getTamanhoPelo();
    }

    public TamanhoPelo getTamanhoPelo() {
        return tamanhoPelo;
    }

    public void setTamanhoPelo(TamanhoPelo tamanhoPelo) {
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public String toString() {
        return "Banho{" +
                "tamanhoPelo=" + tamanhoPelo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Banho banho = (Banho) o;
        return tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanhoPelo);
    }
}