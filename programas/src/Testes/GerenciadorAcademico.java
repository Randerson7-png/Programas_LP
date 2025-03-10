package Testes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAcademico {

    /*
        Responsabilidades dessa classe:
          - Gerenciar matriculas entre alunos e disciplinas
     */

    private List<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAluno(String nome, String matricula){
        Aluno novoAluno = new Aluno(matricula, nome);
        alunos.add(novoAluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void adicionarDisciplina(String nome, String codigo, int capacidadeMaxima){
        Disciplina novaDisciplina = new Disciplina(nome, codigo, capacidadeMaxima);
        disciplinas.add(novaDisciplina);
    }

    public Disciplina getDisciplina(String codigo){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getCodigo().equals(codigo)){
                return disciplina;
            }
        }
        return null;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public Aluno getAluno(String matricula){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula().equals(matricula)){
                return aluno;
            }
        }
        return null;
    }

    public void matricularAluno(Aluno aluno, Disciplina disciplina){
        disciplina.adicionarAluno(aluno);
        aluno.adicionarDisciplina(disciplina);
    }

    public void matricularAluno(String matricula, String codigo){
        Aluno aluno =  getAluno(matricula);
        Disciplina disciplina = getDisciplina(codigo);

        //chama o metodo definido acima desse para evitar
        //repetição de código
        matricularAluno(aluno, disciplina);
    }

}

