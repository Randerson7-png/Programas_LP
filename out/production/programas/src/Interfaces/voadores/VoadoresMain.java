package Interfaces.voadores;

public class VoadoresMain {
    public static void main(String[] args) {
         Voador voadorg = new GalinhaVoadora();
         voadorg.voar();
         voadorg.planar();
         voadorg.pousar();
    }

}
