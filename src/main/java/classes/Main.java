package classes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu para escolher o tipo de veículo
            System.out.println("Escolha o tipo de veículo:");
            System.out.println("1 - Ônibus");
            System.out.println("2 - Patinete Elétrico");
            System.out.println("3 - Táxi");
            System.out.println("4 - Trem Urbano");
            System.out.println("5 - Bicicleta Compartilhada");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 6) {
                break; // Encerra o sistema
            }

            BigDecimal custo;
            BigDecimal custoVariavel;
            BigDecimal custoPorKm;
            BigDecimal custoManutencaoPorUnidade;
            int horasDeUso, numCorridas, kmRodados, numeroDeBicicletas;

            switch (opcao) {
                case 1: // Ônibus
                    System.out.print("Digite o custo do ônibus: ");
                    custo = scanner.nextBigDecimal();
                    Onibus onibus = new Onibus(custo);
                    System.out.println("Custo mensal do ônibus: " + onibus.calculaCustoMensal());
                    break;

                case 2: // Patinete Elétrico
                    System.out.print("Digite o custo por hora do patinete elétrico: ");
                    custo = scanner.nextBigDecimal();
                    System.out.print("Digite o número de horas de uso do patinete: ");
                    horasDeUso = scanner.nextInt();
                    PatineteEletrico patinete = new PatineteEletrico(custo, horasDeUso);
                    System.out.println("Custo mensal do patinete elétrico: " + patinete.calculaCustoMensal());
                    break;

                case 3: // Táxi
                    System.out.print("Digite o custo fixo do táxi: ");
                    custo = scanner.nextBigDecimal();
                    System.out.print("Digite o custo de cada corrida: ");
                    custoVariavel = scanner.nextBigDecimal();
                    System.out.print("Digite o número de corridas: ");
                    numCorridas = scanner.nextInt();
                    Taxi taxi = new Taxi(custo, custoVariavel, numCorridas);
                    System.out.println("Custo mensal do táxi: " + taxi.calculaCustoMensal());
                    break;

                case 4: // Trem Urbano
                    System.out.print("Digite o custo do trem urbano: ");
                    custo = scanner.nextBigDecimal();
                    System.out.print("Digite o custo por Km do trem: ");
                    custoPorKm = scanner.nextBigDecimal();
                    System.out.print("Digite o número de quilômetros rodados: ");
                    kmRodados = scanner.nextInt();
                    TremUrbano trem = new TremUrbano(custo, custoPorKm, kmRodados);
                    System.out.println("Custo mensal do trem urbano: " + trem.calculaCustoMensal());
                    break;

                case 5: // Bicicleta Compartilhada
                    System.out.print("Digite o custo de manutenção por unidade de bicicleta: ");
                    custoManutencaoPorUnidade = scanner.nextBigDecimal();
                    System.out.print("Digite o número de bicicletas: ");
                    numeroDeBicicletas = scanner.nextInt();
                    BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);
                    System.out.println("Custo mensal das bicicletas compartilhadas: " + bicicleta.calculaCustoMensal());
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
