//alunas: lara mendes e yala pereira

package classes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String menu = "escolha o veiculo:\n"
                    + "1 - onibus\n"
                    + "2 - taxi\n"
                    + "3 - bicicleta compartilhada\n"
                    + "4 - trem urbano\n"
                    + "5 - patinete eletrico\n"
                    + "0 - sair";

            int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (escolha == 0) {
                JOptionPane.showMessageDialog(null, "sistema encerrado");
                break;
            }

            Veiculo veiculo = null;

            if (escolha == 1) {
                String input = JOptionPane.showInputDialog("valor fixo mensal do onibus:");
                double valorFixo = Double.parseDouble(input);
                if (valorFixo < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorFixo = 0;
                }
                veiculo = new Onibus(valorFixo);
            } else if (escolha == 2) {
                String input1 = JOptionPane.showInputDialog("valor fixo do taxi:");
                double valorFixo = Double.parseDouble(input1);
                if (valorFixo < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorFixo = 0;
                }
                String input2 = JOptionPane.showInputDialog("num de corridas:");
                int corridas = Integer.parseInt(input2);
                if (corridas < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    corridas = 0;
                }
                String input3 = JOptionPane.showInputDialog("valor por corrida:");
                double valorPorCorrida = Double.parseDouble(input3);
                if (valorPorCorrida < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorPorCorrida = 0;
                }
                veiculo = new Taxi(valorFixo, corridas, valorPorCorrida);
            } else if (escolha == 3) {
                String input1 = JOptionPane.showInputDialog("qtde de bicicletas:");
                int qtdBikes = Integer.parseInt(input1);
                if (qtdBikes < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    qtdBikes = 0;
                }
                String input2 = JOptionPane.showInputDialog("valor mensal por bicicleta:");
                double manutencao = Double.parseDouble(input2);
                if (manutencao < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    manutencao = 0;
                }
                veiculo = new Bicicleta(qtdBikes, manutencao);
            } else if (escolha == 4) {
                String input1 = JOptionPane.showInputDialog("valor fixo do trem:");
                double valorFixo = Double.parseDouble(input1);
                if (valorFixo < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorFixo = 0;
                }
                String input2 = JOptionPane.showInputDialog("km rodados no mês:");
                double kmRodados = Double.parseDouble(input2);
                if (kmRodados < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    kmRodados = 0;
                }
                String input3 = JOptionPane.showInputDialog("valor por km:");
                double valorKm = Double.parseDouble(input3);
                if (valorKm < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorKm = 0;
                }
                veiculo = new Trem(valorFixo, kmRodados, valorKm);
            } else if (escolha == 5) {
                String input1 = JOptionPane.showInputDialog("horas de uso no mês:");
                double horas = Double.parseDouble(input1);
                if (horas < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    horas = 0;
                }
                String input2 = JOptionPane.showInputDialog("valor por hora:");
                double valorHora = Double.parseDouble(input2);
                if (valorHora < 0) {
                    JOptionPane.showMessageDialog(null, "valor negativo");
                    valorHora = 0;
                }
                veiculo = new Patinete(horas, valorHora);
            } else {
                JOptionPane.showMessageDialog(null, "opcão inválida");
                continue;
            }

            double valor = veiculo.calculaValorMensal();
            JOptionPane.showMessageDialog(null, "valor mensal: R$ " + valor);
        }
    }
}