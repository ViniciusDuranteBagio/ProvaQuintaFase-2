package classes;

import java.util.Scanner;

public class Main {
    //Diana e Kemilyn
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transporte transporte = null;

        while (true) {
            System.out.println("\n====== MENU DE TRANSPORTES ======");
            System.out.println("1 - Cadastrar Ônibus");
            System.out.println("2 - Cadastrar Táxi");
            System.out.println("3 - Cadastrar Bicicleta Compartilhada");
            System.out.println("4 - Cadastrar Trem Urbano");
            System.out.println("5 - Cadastrar Patinete Elétrico");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 6) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            System.out.print("Nome do Transporte: ");
            String nome = scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Custo Fixo Mensal: ");
                    transporte = new Onibus(nome, scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Custo Fixo: ");
                    double fixo = scanner.nextDouble();
                    System.out.print("Número de Corridas: ");
                    int corridas = scanner.nextInt();
                    System.out.print("Custo por Corrida: ");
                    double custoCorrida = scanner.nextDouble();
                    transporte = new Taxi(nome, fixo, corridas, custoCorrida);
                    break;
                case 3:
                    System.out.print("Quantidade de Bicicletas: ");
                    int qtdBikes = scanner.nextInt();
                    System.out.print("Custo de Manutenção por Unidade: ");
                    double manutencao = scanner.nextDouble();
                    transporte = new BicicletaCompartilhada(nome, qtdBikes, manutencao);
                    break;
                case 4:
                    System.out.print("Custo Fixo: ");
                    double fixoTrem = scanner.nextDouble();
                    System.out.print("Quilômetros Rodados: ");
                    double km = scanner.nextDouble();
                    System.out.print("Custo por KM: ");
                    double custoKm = scanner.nextDouble();
                    transporte = new TremUrbano(nome, fixoTrem, km, custoKm);
                    break;
                case 5:
                    System.out.print("Horas de Uso no Mês: ");
                    double horas = scanner.nextDouble();
                    System.out.print("Custo por Hora: ");
                    double custoHora = scanner.nextDouble();
                    transporte = new PatineteEletrico(nome, horas, custoHora);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (transporte != null) {
                transporte.exibirInformacoes();
            }
        }

        scanner.close();
    }
}
