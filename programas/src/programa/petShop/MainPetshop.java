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
                        int cod = getCod(inventario);
                        Banho banho = new Banho(cod, Tamanho.PEQUENO,tamPelo);
                        System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        System.out.println(banho.descricao());
                        inventario.adicionaServiso(banho);

                    } else if (escolhaTamanho.equals("2")) {
                        TamanhoPelo tamPelo = verificaTamPelo(sc);
                        Banho banho = new Banho(1, Tamanho.MEDIO,tamPelo);
                        System.out.printf("valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        System.out.println(banho.descricao());
                        inventario.adicionaServiso(banho);

                    } else if (escolhaTamanho.equals("3")) {
                        TamanhoPelo tamPelo = verificaTamPelo(sc);
                        Banho banho = new Banho(1, Tamanho.GRANDE,tamPelo);
                        System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                        System.out.println(banho.descricao());
                        inventario.adicionaServiso(banho);
                    }
                }

                case "2" -> {
                    System.out.println("Informe o tamanho do animal: \n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhatamanho = sc.nextLine();
                    if (escolhatamanho.equals("1")){
                        Tamanho tamanho = Tamanho.PEQUENO;
                        horasNoHotel(sc, inventario, tamanho);
                    }
                    else if (escolhatamanho.equals("2")) {
                        Tamanho tamanho = Tamanho.MEDIO;
                        horasNoHotel(sc, inventario, tamanho);

                    }
                    else if (escolhatamanho.equals("3")) {
                        Tamanho tamanho = Tamanho.GRANDE;
                        horasNoHotel(sc, inventario, tamanho);
                    }
                    else {
                        System.out.println("Tamanho indisponível!");
                    }

                }
                
                case "3" -> {
                    System.out.println("Informe o tamanho do animal: \n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTamanho = sc.nextLine();

                    if(escolhaTamanho.equals("1")){
                        Tamanho tam = Tamanho.PEQUENO;
                        int cod = getCod(inventario);
                        ServicoPetshop tosa = new Tosa(cod, tam);
                        System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                        System.out.println(tosa.descricao());
                        inventario.adicionaServiso(tosa);

                    }
                    else if (escolhaTamanho.equals("2")) {
                        Tamanho tam = Tamanho.MEDIO;
                        int cod = getCod(inventario);
                        ServicoPetshop tosa = new Tosa(cod, tam);
                        System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                        System.out.println(tosa.descricao());
                        inventario.adicionaServiso(tosa);

                    }
                    else if (escolhaTamanho.equals("3")) {
                        Tamanho tam = Tamanho.GRANDE;
                        int cod = getCod(inventario);
                        ServicoPetshop tosa = new Tosa(cod, tam);
                        System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                        System.out.println(tosa.descricao());
                        inventario.adicionaServiso(tosa);

                    }
                }

                case "4" -> {
                    System.out.println("Fechando Loja...");
                    System.out.println(inventario.listaServicos());
                    continuar = false;
                }
            }

        }

    }

    private static int getCod(InventarioPetshop inventario) {
        int cod = inventario.getTamanhoInventario() + 1;
        return cod;
    }

    private static void horasNoHotel(Scanner sc, InventarioPetshop inventario, Tamanho tamanho) {
        System.out.println("Informe a quantidade de horas que o hospede vai ficar: ");
        int opcaoQuantHoras = sc.nextInt();
        int cod = getCod(inventario);
        ServicoPetshop hotelzinho = new Hotel(cod, tamanho, opcaoQuantHoras);
        System.out.printf("Valor do serviço: R$ %.2f%n", hotelzinho.calculaPreco());
        System.out.println(hotelzinho.descricao());
        inventario.adicionaServiso(hotelzinho);
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
