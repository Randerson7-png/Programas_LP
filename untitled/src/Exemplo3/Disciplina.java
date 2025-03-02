package Exemplo3;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private String cod;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, String cod) {

        this.nome = nome;
        this.cod = cod;
    }

    public void adicionarAluno(Aluno aluno) throws Exception{
        if(aluno == null){
            throw new Exception("O aluno não pode ser nulo!");
        }
        this.alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}

