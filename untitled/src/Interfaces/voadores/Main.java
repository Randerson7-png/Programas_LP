package Interfaces.voadores;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Voador> voadores = new ArrayList<>();

        Voador voador1 = new Aviao("Grande", 2025);
        Voador voador2 = new GalinhaVoadora();
        Voador voador3 = new Drone("Pequeno");
        Voador voador4 = new Aviao("XR8", 2006);
        Voador voador5 = new GalinhaVoadora();
        Voador voador6 = new Aviao("Medio", 2013);
        Voador voador7 = new GalinhaVoadora();
        Voador voador8 = new Drone("Largo");
        Voador voador9 = new Aviao("Acelerado", 2010);
        Voador voador10 = new GalinhaVoadora();

        voadores.add(voador1);
        voadores.add(voador2);
        voadores.add(voador3);
        voadores.add(voador4);
        voadores.add(voador5);
        voadores.add(voador6);
        voadores.add(voador7);
        voadores.add(voador8);
        voadores.add(voador9);
        voadores.add(voador10);



    }
}
