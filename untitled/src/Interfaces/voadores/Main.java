package Interfaces.voadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Voador> voadores = new ArrayList<>();

        Random random = new Random();
        int opcao = random.nextInt(3);

        Voador voador; // chamada polimorfica

        for(int i = 0; i < 10; i++){

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

        }
    }
}
