package Testes;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private String codigo;
    private List<Aluno> alunos = new ArrayList<>();
    private int capacidadeMaxima; //Uma disciplina não pode ter mais alunos que este valor

    public Disciplina(String nome, String codigo, int capacidadeMaxima) {
        this.nome = nome;
        this.codigo = codigo;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void removerAluno(String matricula){
        for(Aluno aluno : this.alunos){
            if(aluno.getMatricula().equals(matricula)){
                this.alunos.remove(aluno);
                return;
            }
        }
    }
}

