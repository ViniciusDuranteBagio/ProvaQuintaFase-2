package main.java.classes;

import main.java.classes.*;

import javax.swing.*;

public class Main {
    //Dupla: José Felisbino e Vinicius Matei
    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {

        int opcao = 0;

        while (opcao != 6){

            int menu = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n" +
                    "1. Criar Onibus\n" +
                    "2. Criar Táxi\n" +
                    "3. Criar Bicicleta\n" +
                    "4. Criar Trem\n" +
                    "5. Criar Patinete\n" +
                    "6. Sair\n" +
                    "Escolha uma opção:"));

            switch (menu) {
                case 1:
                    String modeloOnibus = JOptionPane.showInputDialog("Digite o modelo do ônibus:");
                    String custoFixoMensalOnibusStr = JOptionPane.showInputDialog("Digite o custo fixo mensal do ônibus:");
                    double custoFixoMensalOnibus = Double.parseDouble(custoFixoMensalOnibusStr);
                    Onibus onibus = new Onibus(modeloOnibus, custoFixoMensalOnibus);
                    JOptionPane.showMessageDialog(null, "Ônibus criado com sucesso!\nModelo: " + onibus.getModelo() + "\nCusto Fixo Mensal: " + onibus.getCustoFixoMensal() + "\nCalcular Custo: " + onibus.calcularCusto());
                    break;
                case 2:
                    String modeloTaxi = JOptionPane.showInputDialog("Digite o modelo do táxi:");
                    double custoFixoMensalTaxi = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo fixo mensal do táxi:"));
                    int numeroCorridas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de corridas realizadas:"));
                    double custoPorCorrida = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo por corrida:"));
                    Taxi taxi = new Taxi(modeloTaxi, custoFixoMensalTaxi, numeroCorridas, custoPorCorrida);
                    JOptionPane.showMessageDialog(null, "Taxi criado com sucesso!\nModelo: " + taxi.getModelo() + "\nCusto Fixo: " + taxi.getCustoFixo() + "\nNúmero de Corridas: " + taxi.getNumeroCorridas() + "\nCusto por Corrida: " + taxi.getCustoCadaCorrida() + "\nCusto Total: " + taxi.calcularCusto());
                    break;
                case 3:
                    String modeloBicicleta = JOptionPane.showInputDialog("Digite o modelo da bicicleta:");
                    int qtdDeBicicletas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de bicicletas:"));
                    double custoManutencaoUnidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de manutenção por unidade:"));
                    Bicicleta bicicleta = new Bicicleta(modeloBicicleta, qtdDeBicicletas, custoManutencaoUnidade);
                    JOptionPane.showMessageDialog(null, "Bicicleta criada com sucesso!\nModelo: " + bicicleta.getModelo() + "\nQuantidade de Bicicletas: " + bicicleta.getQtdDeBicicletas() + "\nCusto de Manutenção por Unidade: " + bicicleta.getCustoManutencaoUnidade() + "\nCusto Total: " + bicicleta.calcularCusto());
                    break;
                case 4:
                    String modeloTrem = JOptionPane.showInputDialog("Digite o modelo do trem:");
                    double custoFixoMensalTrem = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo fixo mensal do trem:"));
                    double qtdKmRodados = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilômetros rodados:"));
                    double adiocionalQuilometro = Double.parseDouble(JOptionPane.showInputDialog("Digite o adicional por quilômetro:"));
                    Trem trem = new Trem(modeloTrem, custoFixoMensalTrem, qtdKmRodados, adiocionalQuilometro);
                    JOptionPane.showMessageDialog(null, "Trem criado com sucesso!\nModelo: " + trem.getModelo() + "\nCusto Fixo Mensal: " + trem.getCustoFixoMensal() + "\nQuantidade de Quilômetros Rodados: " + trem.getQtdKmRodados() + "\nAdicional por Quilômetro: " + trem.getAdiocionalQuilometro() + "\nCusto Total: " + trem.calcularCusto());
                    break;
                case 5:
                    String modeloPatinete = JOptionPane.showInputDialog("Digite o modelo do patinete:");
                    int qtdHorasUso= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas de uso:"));
                    double custoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo por hora:"));
                    Patinete patinete = new Patinete(modeloPatinete, qtdHorasUso, custoPorHora);
                    JOptionPane.showMessageDialog(null, "Patinete criado com sucesso!\nModelo: " + patinete.getModelo() + "\nQuantidade de Horas de Uso: " + patinete.getQtdHorasUso() + "\nCusto por Hora: " + patinete.getCustoPorHora() + "\nCusto Total: " + patinete.calcularCusto());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    opcao = 6;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    exibirMenu();
            }
        }
    }

}
