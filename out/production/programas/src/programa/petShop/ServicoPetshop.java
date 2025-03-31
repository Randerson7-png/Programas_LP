package programa.petShop;

import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetshop implements ServicoPetshopIF{

    private LocalDate data;
    private int codigo;
    private Tamanho tamanho;

    public ServicoPetshop(int codigo, Tamanho tamanho) {
        this.codigo = codigo;
        this.tamanho = tamanho;
        LocalDate.now();
    }

    public abstract double calculaPreco() ;

    public abstract String descricao ();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ServicoPetshop{" +
                "codigo=" + codigo +
                ", tamanho=" + tamanho +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoPetshop that = (ServicoPetshop) o;
        return codigo == that.codigo && tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tamanho);
    }
}
