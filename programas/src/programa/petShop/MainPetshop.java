package programa.petShop;

import java.util.Scanner;

public class MainPetshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean continuar = true;


        while(continuar){
            System.out.println("Digite:\n 1.Banho\n2.Hotel\n3.Tosa\n4.Para fechar a loja");
            String digito = sc.nextLine();

            switch (digito) {
                case "1" -> {
                    System.out.println("Informe o tamanho do animal:\n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTamanho = sc.nextLine();
                    if (escolhaTamanho.equals("1")) {
                        verificaTamPelo(sc);
                    } else if (escolhaTamanho.equals("2")) {
                        verificaTamPelo(sc);

                    } else if (escolhaTamanho.equals("3")) {
                        verificaTamPelo(sc);
                    }
                }

                case "2" -> {
                    System.out.println("Informe o tamanho do animal: \n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTam = sc.nextLine();
                    if (escolhaTam.equals("1")){
                        Tamanho tamanho = Tamanho.PEQUENO;
                    }
                    else if (escolhaTam.equals("2")) {
                        Tamanho tamanho = Tamanho.MEDIO;
                    }
                    else if (escolhaTam.equals("3")) {
                        Tamanho tamanho = Tamanho.GRANDE;
                    }

                }
            }


        }



    }

    private static void verificaTamPelo(Scanner sc) {
        System.out.println("Informe o tamanho do pelo:\n 1.Curto\n 2.Médio\n 3.Longo");
        String OpcaotamPelo = sc.nextLine();
        TamanhoPelo tamPelo;
        switch (OpcaotamPelo) {
            case "1" -> {
                tamPelo = TamanhoPelo.CURTO;
            }
            case "2" -> {
                tamPelo = TamanhoPelo.MEDIO;
            }
            case "3" -> {
                tamPelo = TamanhoPelo.LONGO;
            }
        }
    }
}
