package Testes;


import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String matricula;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>(); //Aluno pode ter no maximo 5 disciplinas


    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public void removerDisciplina(int indice){
        this.disciplinas.remove(indice);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

