package classes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.entities.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        
        int op = 0;
        do {
            System.out.println("""
                Escolha uma opção:

                1 - Onibus
                2 - Taxi
                3 - Bicileta
                4 - Trem Urbano
                5 - Patinete
                6 - Listar todos
                
                7 - Sair
                    """);
            
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.println("Insira o modelo do ônibus:");
                    String modeloOnibus = sc.nextLine();
                    
                    System.out.println("Insira o custo fixo:");
                    double custoFixoOnibus = validarValor(sc.nextDouble());
                    sc.nextLine();

                    veiculos.add(new Onibus(modeloOnibus, custoFixoOnibus));
                    System.out.println(veiculos.get(veiculos.size() - 1) + "\n");
                    break;
                
                case 2:

                    System.out.println("Insira o modelo do Taxi");
                    String modeloTaxi = sc.nextLine();

                    System.out.println("Insira o custo fixo:");
                    double custoFixoTaxi = validarValor(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Insira a quantidade de Corridas:");
                    int qtdCorridas = (int) validarValor(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Insira o valor das corridas:");
                    double valorCorridasTaxi = validarValor(sc.nextDouble());
                    sc.nextLine();

                    veiculos.add(new Taxi(modeloTaxi, custoFixoTaxi, qtdCorridas, valorCorridasTaxi));
                    System.out.println(veiculos.get(veiculos.size() - 1) + "\n");

                    break;

                case 3:

                    System.out.println("Insira o modelo da Bicileta:");
                    String modeloBicicleta = sc.nextLine();

                    System.out.println("Insira a quantidade de Bicicletas:");
                    int qtdBicicletas = (int) validarValor(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Insira o valor da manutenção de cada bicicleta:");
                    double manutencaoBicicleta = validarValor(sc.nextDouble());
                    sc.nextLine();

                    veiculos.add(new Bicicleta(modeloBicicleta, qtdBicicletas, manutencaoBicicleta));
                    System.out.println(veiculos.get(veiculos.size() - 1) + "\n");

                    break;

                case 4:

                    System.out.println("Insira o modelo do Trem:");
                    String modeloTrem = sc.nextLine();

                    System.out.println("Insira o custo fixo:");
                    double custoFixoTrem = validarValor(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Insira a quantidade de KM rodados:");
                    int kmRodadosTrem = (int) validarValor(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Insira o valor por KM:");
                    double valorPorKmTrem = validarValor(sc.nextDouble());
                    sc.nextLine();

                    veiculos.add(new TremUrbano(modeloTrem, custoFixoTrem, kmRodadosTrem, valorPorKmTrem));
                    System.out.println(veiculos.get(veiculos.size() - 1) + "\n");

                    break;

                case 5:
                    System.out.println("Insira o modelo do Patinete");
                    String modeloPatinete = sc.nextLine();

                    System.out.println("Insira o valor por Hora");
                    double valorPorHoraPatinete = validarValor(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Insira a quantidade de horas");
                    int qtdHorasPatinete = (int) validarValor(sc.nextInt());
                    sc.nextLine();

                    veiculos.add(new Patinete(modeloPatinete, valorPorHoraPatinete, qtdHorasPatinete));
                    System.out.println(veiculos.get(veiculos.size() - 1) + "\n");

                    break;

                case 6:
                    System.out.println("Lista de Veiculos:\n");
                    for(Veiculo e: veiculos) {
                        System.out.println(e + "\n");
                    }
                    
                    break;
                
                case 7:
                    System.out.println("Encerrando o Sistema...");
                    break;

                default:
                    System.out.println("Valor Invalido");
                    break;
            }
            
        } while (op!=7);

        sc.close();
    }

    public static double validarValor(double valor) {
        if (valor < 0) {
            System.out.println("Valor Inválido. Valor alterado para zero.");
            return 0;
        } 
        return valor;
    }
}
