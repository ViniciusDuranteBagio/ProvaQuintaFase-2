package classes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    while (true) {
        String[] opcoes = {"Ônibus", "Táxi", "Bicicleta", "Trem", "Patinete", "Sair"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de veículo:",
                "Sistema de Transporte", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (escolha == null || escolha.equals("Sair")) {
            break;
        }

        double custoMensal = 0;
        switch (escolha) {
            case "Ônibus":
                double custoFixoOnibus = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                Onibus onibus = new Onibus(custoFixoOnibus);
                custoMensal = onibus.calcularCustoMensal();
                break;
            case "Táxi":
                double custoFixoTaxi = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                int corridas = Integer.parseInt(JOptionPane.showInputDialog("Número de corridas:"));
                double custoCorrida = Double.parseDouble(JOptionPane.showInputDialog("Custo por corrida:"));
                Taxi taxi = new Taxi(custoFixoTaxi, corridas, custoCorrida);
                custoMensal = taxi.calcularCustoMensal();
                break;
            case "Bicicleta":
                int qtdBikes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de bicicletas:"));
                double custoManutencao = Double.parseDouble(JOptionPane.showInputDialog("Custo manutenção por unidade:"));
                BicicletaCompartilhada bike = new BicicletaCompartilhada(qtdBikes, custoManutencao);
                custoMensal = bike.calcularCustoMensal();
                break;
            case "Trem":
                double custoFixoTrem = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo:"));
                double kmRodados = Double.parseDouble(JOptionPane.showInputDialog("Quilômetros rodados:"));
                double custoKm = Double.parseDouble(JOptionPane.showInputDialog("Custo por km:"));
                TremUrbano trem = new TremUrbano(custoFixoTrem, kmRodados, custoKm);
                custoMensal = trem.calcularCustoMensal();
                break;
            case "Patinete":
                double horas = Double.parseDouble(JOptionPane.showInputDialog("Horas de uso:"));
                double custoHora = Double.parseDouble(JOptionPane.showInputDialog("Custo por hora:"));
                PatineteEletrico patinete = new PatineteEletrico(horas, custoHora);
                custoMensal = patinete.calcularCustoMensal();
                break;
        }

        JOptionPane.showMessageDialog(null, "Custo mensal: R$" + String.format("%.2f", custoMensal));
    }
}
}