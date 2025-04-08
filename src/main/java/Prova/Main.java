package Prova;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String menu = "Escolha uma opção:\n" +
                "1 - Ônibus\n" +
                "2 - Táxi\n" +
                "3 - Bicicleta Compartilhada\n" +
                "4 - Trem Urbano\n" +
                "5 - Patinete Elétrico\n" +
                "0 - Sair";

        int opcao;
        do {
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break; // Cancelar

            opcao = Integer.parseInt(input);
            Veiculos veiculo = null;

            switch (opcao) {
                case 1 -> {
                    String nome = JOptionPane.showInputDialog("Nome do ônibus:");
                    double custo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                }
                case 2 -> {
                    String nome = JOptionPane.showInputDialog("Nome do táxi:");
                    double fixo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                    int corridas = Integer.parseInt(JOptionPane.showInputDialog("Número de corridas:"));
                    double custoCorrida = Double.parseDouble(JOptionPane.showInputDialog("Custo por corrida:"));
                    veiculo = new Taxi(nome, fixo, corridas, custoCorrida);
                }
                case 3 -> {
                    String nome = JOptionPane.showInputDialog("Nome do sistema de bikes:");
                    int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de bicicletas:"));
                    double manut = Double.parseDouble(JOptionPane.showInputDialog("Custo de manutenção por bicicleta:"));
                }
                case 4 -> {
                    String nome = JOptionPane.showInputDialog("Nome do trem:");
                    double fixo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                    double km = Double.parseDouble(JOptionPane.showInputDialog("Km rodados:"));
                    double porKm = Double.parseDouble(JOptionPane.showInputDialog("Custo por km:"));

                }
                case 5 -> {
                    String nome = JOptionPane.showInputDialog("Nome do sistema de patinetes:");
                    double horas = Double.parseDouble(JOptionPane.showInputDialog("Horas de uso no mês:"));
                    double porHora = Double.parseDouble(JOptionPane.showInputDialog("Custo por hora:"));
                }
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                }
                default -> {
                    if (opcao != 0)
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            }

            if (veiculo != null) {
                JOptionPane.showMessageDialog(null,
                        "Custo mensal de " + veiculo.getNome());
            }

        } while (opcao != 0);
    }
}
