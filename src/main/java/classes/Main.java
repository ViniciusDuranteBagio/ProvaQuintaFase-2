package classes;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n .Sistema de Gerenciamento de Transporte Público. ");
            System.out.println("1. Cadastrar Ônibus");
            System.out.println("2. Cadastrar Táxi");
            System.out.println("3. Cadastrar Bicicleta Compartilhada");
            System.out.println("4. Cadastrar Trem Urbano");
            System.out.println("5. Cadastrar Patinete Elétrico");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            VeiculoPublico veiculo = null;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o custo fixo mensal do ônibus: ");
                    double custoFixoOnibus = scanner.nextDouble();
                    veiculo = new Onibus(custoFixoOnibus);
                    break;

                case 2:
                    System.out.print("Digite o custo fixo do táxi: ");
                    double custoFixoTaxi = scanner.nextDouble();
                    System.out.print("Digite o número de corridas no mês: ");
                    int numeroCorridas = scanner.nextInt();
                    System.out.print("Digite o custo por corrida: ");
                    double custoPorCorrida = scanner.nextDouble();
                    veiculo = new Taxi(custoFixoTaxi, numeroCorridas, custoPorCorrida);
                    break;

                case 3:
                    System.out.print("Digite a quantidade de bicicletas: ");
                    int quantidadeBicicletas = scanner.nextInt();
                    System.out.print("Digite o custo de manutenção por bicicleta: ");
                    double custoManutencao = scanner.nextDouble();
                    veiculo = new BicicletaCompartilhada(quantidadeBicicletas, custoManutencao);
                    break;

                case 4:
                    System.out.print("Digite o custo fixo do trem: ");
                    double custoFixoTrem = scanner.nextDouble();
                    System.out.print("Digite os quilômetros rodados no mês: ");
                    double kmRodados = scanner.nextDouble();
                    System.out.print("Digite o custo por quilômetro: ");
                    double custoPorKm = scanner.nextDouble();
                    veiculo = new TremUrbano(custoFixoTrem, kmRodados, custoPorKm);
                    break;

                case 5:
                    System.out.print("Digite as horas de uso do patinete no mês: ");
                    double horasUso = scanner.nextDouble();
                    System.out.print("Digite o custo por hora: ");
                    double custoPorHora = scanner.nextDouble();
                    veiculo = new PatineteEletrico(horasUso, custoPorHora);
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            if (veiculo != null) {
                System.out.printf("Custo mensal do %s: R$ %.2f%n", veiculo.getTipo(), veiculo.calcularCustoMensal());
            }
        }

        scanner.close();
    }
}