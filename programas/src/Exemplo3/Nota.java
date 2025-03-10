package Exemplo3;

public class Nota {

    private double valor;
    private Disciplina disciplina;

    public Nota(double valor, Disciplina disciplina) {
        this.valor = valor;
        this.disciplina = disciplina;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception {
        if(valor > 10 || valor < 0){
            throw new Exception("O valor precisa estar acima de 0 e abaixo de 10!");
        }
        this.valor = valor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
