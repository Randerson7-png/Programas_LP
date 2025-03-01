package Exemplo3;

import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String matricula;

    private List<Nota> notas = new ArrayList<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNota(Nota nota) throws Exception{
        if(nota == null){
            throw new Exception("A nota não pode ser nula!");
        }
        this.notas.add(nota);
    }

    public void adicionarNota(double valor, Disciplina disciplina) throws Exception{
        if(disciplina == null){
            throw new Exception("A disciplina não pode se encontra nula!");
        }

        Nota nota = new Nota(valor, disciplina);
        this.notas.add(nota);
    }

    public void adicionarNotas(List<Nota> notas) throws Exception{
        if(notas.isEmpty()){
            throw new Exception("A lista está vazia!");
        }
        this.notas.addAll(notas);
    }

    public void adicionarNotas(Nota[] notas)throws Exception{
        if(notas.length == 0){
            throw new Exception("O array está vazio!");
        }
        for(Nota nota : notas){
            this.adicionarNota(nota);
        }
    }

    public double calcularMediaDisciplina(Disciplina disciplina) throws Exception{
        if(disciplina == null){
            throw new Exception("A disciplina se encontra nula!");

        }
        double valor_total = 0;
        double quantidade = 0;
        for(Nota nota: notas){
            if(nota.getDisciplina().equals(disciplina)){
                valor_total += nota.getValor();
                quantidade++;
            }
        }
        return valor_total / quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}


