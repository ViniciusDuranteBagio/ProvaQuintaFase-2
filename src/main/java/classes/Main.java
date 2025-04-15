package classes;

import javax.swing.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {

String[] opcoes = {"Ônibus", "Táxi", "Bicicleta", "Trem", "Patinete", "Sair"};
int escolha;
 do {
     escolha = JOptionPane.showOptionDialog(null, "Selecione o tipo de veículo:",
             "Menu Veículos Públicos", JOptionPane.DEFAULT_OPTION,
             JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

     VeiculoPublico veiculo = null;
     switch (escolha) {
         case 0 -> { // Ônibus
             double fixo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo mensal:"));
             veiculo = new Onibus(fixo);
         }
         case 1 -> { // Táxi
             double fixo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo mensal:"));
             int corridas = Integer.parseInt(JOptionPane.showInputDialog("Número de corridas:"));
             double custoCorrida = Double.parseDouble(JOptionPane.showInputDialog("Custo por corrida:"));
             veiculo = new Taxi(fixo, corridas, custoCorrida);
         }
         case 2 -> { // Bicicleta
             int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de bicicletas:"));
             double custo = Double.parseDouble(JOptionPane.showInputDialog("Custo de manutenção por unidade:"));
             veiculo = new BicicletaCompartilhada(qtd, custo);
         }
         case 3 -> { // Trem
             double fixo = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo mensal:"));
             double km = Double.parseDouble(JOptionPane.showInputDialog("Km percorridos:"));
             double custoKm = Double.parseDouble(JOptionPane.showInputDialog("Custo por km:"));
             veiculo = new Trem(fixo, km, custoKm);
         }
         case 4 -> { // Patinete
             int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de uso mensal:"));
             double custoHora = Double.parseDouble(JOptionPane.showInputDialog("Custo por hora:"));
             veiculo = new Patinete(horas, custoHora);
         }
     }

     if (veiculo != null) {
         double custo = veiculo.calcularCustoMensal();
         JOptionPane.showMessageDialog(null, "Custo mensal calculado: R$ " + String.format("%.2f", custo));
     }

 } while (escolha != 5); // 5 = Sair
    }
}