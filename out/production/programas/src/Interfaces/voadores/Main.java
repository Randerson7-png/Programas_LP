package Interfaces.voadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Voador> voadores = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < 10; i++){

            int opcao = random.nextInt(3);
            Voador voador; // chamada polimorfica

            if(opcao == 0){
                voador = new GalinhaVoadora(); // outra
            }
            else if (opcao == 1) {
                voador = new Aviao("XLR8", 2019); // outra
            }
            else{
                voador =  new Drone("G300"); // outra
            }
            voadores.add(voador);

            System.out.println(voadores.size()); // coloquei para conferir se o tamanho dos voadores estava correto

            for( Voador v : voadores ){
                System.out.println(v.toString()); // conferindo se estava dando certo
            }
        }
    }
}
