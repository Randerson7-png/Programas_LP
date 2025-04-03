package programa.petShop;

import java.util.Scanner;

public class MainPetshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventarioPetshop inventario = new InventarioPetshop();
        Facade facade = new Facade(inventario);
        boolean continuar = true;


        while(continuar){
            System.out.println("Digite:\n1.Banho\n2.Hotel\n3.Tosa\n4.Para fechar a loja");
            String digito = sc.nextLine();

            switch (digito) {
                case "1" -> {
                    System.out.println("Informe o tamanho do animal:\n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTamanho = sc.nextLine();
                    switch (escolhaTamanho) {
                        case "1" -> {
                            TamanhoPelo tamPelo = verificaTamPelo(sc);
                            int cod = getCod(inventario);
                            ServicoPetshop banho = facade.criaBanho(cod, Tamanho.PEQUENO, tamPelo);
                            inventario.adicionaServiso(banho);
                            System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                            System.out.println(banho.descricao());

                        }
                        case "2" -> {
                            TamanhoPelo tamPelo = verificaTamPelo(sc);
                            int cod = getCod(inventario);
                            ServicoPetshop banho = facade.criaBanho(cod, Tamanho.MEDIO, tamPelo);
                            inventario.adicionaServiso(banho);
                            System.out.printf("valor do serviço: R$ %.2f%n", banho.calculaPreco());
                            System.out.println(banho.descricao());

                        }
                        case "3" -> {
                            TamanhoPelo tamPelo = verificaTamPelo(sc);
                            ServicoPetshop banho = facade.criaBanho(getCod(inventario), Tamanho.GRANDE, tamPelo);
                            inventario.adicionaServiso(banho);
                            System.out.printf("Valor do serviço: R$ %.2f%n", banho.calculaPreco());
                            System.out.println(banho.descricao());
                        }
                    }
                }

                case "2" -> {
                    System.out.println("Informe o tamanho do animal: \n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhatamanho = sc.nextLine();
                    switch (escolhatamanho) {
                        case "1" -> {
                            Tamanho tamanho = Tamanho.PEQUENO;
                            System.out.println("Informe a quantidade de horas que o hospede vai ficar: ");
                            int opcaoQuantHoras = sc.nextInt();
                            int cod = getCod(inventario);
                            ServicoPetshop hotelzinho = facade.hospedaNoHotelzinho(cod, tamanho, opcaoQuantHoras);
                            System.out.printf("Valor do serviço: R$ %.2f%n", hotelzinho.calculaPreco());
                            System.out.println(hotelzinho.descricao());
                            inventario.adicionaServiso(hotelzinho);

                        }
                        case "2" -> {
                            Tamanho tamanho = Tamanho.MEDIO;
                            System.out.println("Informe a quantidade de horas que o hospede vai ficar: ");
                            int opcaoQuantHoras = sc.nextInt();
                            int cod = getCod(inventario);
                            ServicoPetshop hotelzinho = facade.hospedaNoHotelzinho(cod, tamanho, opcaoQuantHoras);
                            System.out.printf("Valor do serviço: R$ %.2f%n", hotelzinho.calculaPreco());
                            System.out.println(hotelzinho.descricao());
                            inventario.adicionaServiso(hotelzinho);

                        }
                        case "3" -> {
                            Tamanho tamanho = Tamanho.GRANDE;
                            System.out.println("Informe a quantidade de horas que o hospede vai ficar: ");
                            int opcaoQuantHoras = sc.nextInt();
                            int cod = getCod(inventario);
                            ServicoPetshop hotelzinho = facade.hospedaNoHotelzinho(cod, tamanho, opcaoQuantHoras);
                            System.out.printf("Valor do serviço: R$ %.2f%n", hotelzinho.calculaPreco());
                            System.out.println(hotelzinho.descricao());
                            inventario.adicionaServiso(hotelzinho);
                        }
                        default -> System.out.println("Tamanho indisponível!");
                    }

                }
                
                case "3" -> {
                    System.out.println("Informe o tamanho do animal: \n 1.Pequeno \n 2.Médio\n 3.Grande");
                    String escolhaTamanho = sc.nextLine();

                    switch (escolhaTamanho) {
                        case "1" -> {
                            Tamanho tam = Tamanho.PEQUENO;
                            int cod = getCod(inventario);
                            ServicoPetshop tosa = facade.criaTosa(cod, tam);
                            inventario.adicionaServiso(tosa);
                            System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                            System.out.println(tosa.descricao());

                        }
                        case "2" -> {
                            Tamanho tam = Tamanho.MEDIO;
                            int cod = getCod(inventario);
                            ServicoPetshop tosa = facade.criaTosa(cod, tam);
                            inventario.adicionaServiso(tosa);
                            System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                            System.out.println(tosa.descricao());
                        }
                        case "3" -> {
                            Tamanho tam = Tamanho.GRANDE;
                            int cod = getCod(inventario);
                            ServicoPetshop tosa = facade.criaTosa(cod, tam);
                            inventario.adicionaServiso(tosa);
                            System.out.printf("Valor do serviço: R$ %.2f%n", tosa.calculaPreco());
                            System.out.println(tosa.descricao());
                        }
                    }
                }

                case "4" -> {
                    System.out.println("Fechando Loja...");
                    System.out.println(inventario.listaServicos() + "\n" + inventario.getExtrato());
                    continuar = false;
                }
            }
        }
        sc.close();
    }

    private static int getCod(InventarioPetshop inventario) {
        return inventario.getTamanhoInventario() + 1;
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
