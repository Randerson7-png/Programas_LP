package Exemplo3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Disciplina ip = new Disciplina("Introdução à programação", "IP-001");
        Disciplina lp = new Disciplina("Linguagem de programação", "LP-002");
        Disciplina arquitetura = new Disciplina("Arquitetura", "ARQ-002");

        Aluno joao    = new Aluno("João", "J20250101");
        Aluno carla   = new Aluno("Carla", "C20250101");
        Aluno charlie = new Aluno("Charlie", "C20250102");

        Nota ipN1J = new Nota(10, ip);
        Nota ipN2J = new Nota(9, ip);
        Nota ipN3J = new Nota(9.5, ip);

        Nota[] notasJoao = {ipN1J, ipN2J, ipN3J};

        Nota ipN1Carla = new Nota(9.5, ip);
        Nota ipN2Carla = new Nota(10, ip);
        Nota ipN3Carla = new Nota(10, ip);

        Nota[] notasCarla = {ipN1Carla, ipN2Carla, ipN3Carla};

        try {
            joao.adicionarNotas(notasJoao);
            carla.adicionarNotas(notasCarla);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       try{
           Nota ipN1Charile = new Nota(10.5, ip); //deve lançar exceção pois a nota é maior que 10.5
           Nota ipN2Charile = new Nota(9.5, ip);
           Nota ipN3Charile = new Nota(10, ip);

           Nota[] notasCharlie = {ipN1Charile, ipN2Charile, ipN3Charile};
           charlie.adicionarNotas(notasCharlie);

       } catch (Exception e){
           System.out.println(e.getMessage());

       }

       try{
           System.out.println("Media em ip de joão: " + joao.calcularMediaDisciplina(ip));
           System.out.println("Media em ip de carla: " + carla.calcularMediaDisciplina(ip));
           System.out.println("Media em ip de charlie: " + charlie.calcularMediaDisciplina(ip));

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }

        try{
            charlie.adicionarNota(10, null);
            charlie.adicionarNota(10, null); //deve lançar exceção pois a disciplina é nula
            charlie.adicionarNota(null); //deve lançar exceção pois a nota é null

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        Nota[] notasVazias = {};

        try{
            charlie.adicionarNotas(notasVazias); //deve lançar exeção pois a lista é vazia
            charlie.adicionarNotas(new ArrayList<Nota>()); //deve lançar exceção pois a lista é vazia

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Disciplina algebraLinear = new Disciplina("Algebra", ""); //deve lançar uma exceção pois o código é inválido

        //PLUS: Como você faria para armazenar as disciplinas de um curso?
        //      Seria necessário criar uma nova classe?
        //      Seria possível validar as disciplinas impedindo que elas tenham códigos iguais?




    }
}
