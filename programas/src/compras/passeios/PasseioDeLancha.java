package compras.passeios;

import java.util.Objects;

public class PasseioDeLancha implements VendaDeTurismoIF{

    private int numeroDePessoas;
    private int q1deDeHoras;
    private final double PRECO_POR_PESSOA = 60.00;


    public PasseioDeLancha(int q1deDeHoras, int numeroDePessoas) throws Exception{
        this.q1deDeHoras = q1deDeHoras;
        this.numeroDePessoas = numeroDePessoas;
    }

    private void testaEntrada(double PRECO_POR_PESSOA, int q1deDeHoras, int numeroDePessoas)throws Exception{

        if(PRECO_POR_PESSOA != 60){
            throw new Exception("O preço de um passeio de lancha por pessoa, por hora é R$ 60,00.");
        }
        if(q1deDeHoras > 1 && q1deDeHoras < 11){
            throw new Exception("O passeio deve durar no mínimo 1h e no máximo 10h");
        }
        if(numeroDePessoas > 0){
            throw new Exception("Pelo menos uma pessoa deve participar do passeio!");
        }
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int novaQtde) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public int getQ1deDeHoras() {
        return q1deDeHoras;
    }

    public void setQ1deDeHoras(int novaQtdeDeHoras) {
        this.q1deDeHoras = q1deDeHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoas == that.numeroDePessoas && q1deDeHoras == that.q1deDeHoras && Double.compare(PRECO_POR_PESSOA, that.PRECO_POR_PESSOA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePessoas, q1deDeHoras, PRECO_POR_PESSOA);
    }

    @Override
    public String toString() {
        return "PasseioDeLancha{" +
                "numeroDePessoas=" + numeroDePessoas +
                ", q1deDeHoras=" + q1deDeHoras +
                ", PRECO_POR_PESSOA=" + PRECO_POR_PESSOA +
                '}';
    }


    @Override
    public double getPreco() {
        //O preco de um passeio deve multiplicar o número de pessoas pelo número de horas pelo valor do passeio por pessoa por hora.
        double precoPasseio = (numeroDePessoas * q1deDeHoras * PRECO_POR_PESSOA);
        return precoPasseio;
    }

    @Override
    public String getDescricao() {
        return "Número de pessoas = " + getNumeroDePessoas() + "\n" + "Quantidade de horas = " + getQ1deDeHoras() + "\n" + "Preço por pessoa = " + getPreco() + ".";
    }

    @Override
    public int compareTo(VendaDeTurismoIF vendas) {
        return Double.compare(this.getPreco(),vendas.getPreco());
    }
}
