package programa.petShop;

import java.util.Scanner;

public class MainPetshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventarioPetshop inventario = new InventarioPetshop();

        boolean continuar = true;


        while(continuar){
            System.out.println("Digite:\n1.Banho\n2.Hotel\n3.Tosa\n4.Para fechar a loja");
            String digito = sc.nextLine();

            switch (digito) {
                case "1" -> {
                    System.out.println("Informe o tamanho do animal:\n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTamanho = sc.nextLine();
                    if (escolhaTamanho.equals("1")) {
                        TamanhoPelo tamPelo = verificaTamPelo(sc);
                        Banho banho = new Banho(1, Tamanho.PEQUENO,tamPelo);
                        System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        inventario.adicionaServiso(banho);
                    } else if (escolhaTamanho.equals("2")) {
                        TamanhoPelo tamPelo = verificaTamPelo(sc);
                        Banho banho = new Banho(1, Tamanho.MEDIO,tamPelo);
                        System.out.printf("valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        inventario.adicionaServiso(banho);

                    } else if (escolhaTamanho.equals("3")) {
                        TamanhoPelo tamPelo = verificaTamPelo(sc);
                        Banho banho = new Banho(1, Tamanho.GRANDE,tamPelo);
                        System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        inventario.adicionaServiso(banho);
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

    private static TamanhoPelo verificaTamPelo(Scanner sc) {
        System.out.println("Informe o tamanho do pelo:\n 1.Curto\n 2.Médio\n 3.Longo");
        String OpcaotamPelo = sc.nextLine();
        TamanhoPelo tamPelo = null;
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
        return tamPelo;
    }
}
