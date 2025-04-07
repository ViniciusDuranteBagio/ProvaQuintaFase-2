package classes;

import javax.swing.*;
import java.util.ArrayList;

public class mainVeiculos {
    public static void main(String[] args) {
        boolean continuar = true;
        ArrayList<VeiculoPublico> veiculosPublicos = new ArrayList<>();

        while (continuar) {
            String menu = "===== Menu de Escolha =====\n" +
                    "1. Cadastrar um Ônibus\n" +
                    "2. Cadastrar um Táxi\n" +
                    "3. Cadastrar uma Bicicleta\n" +
                    "4. Cadastrar um Trem\n" +
                    "5. Cadastrar um Patinete\n" +
                    "6. Mostrar todos os veículos cadastrados\n" +
                    "7. Encerrar Sistema\n" +
                    "===========================";

            String opcao = JOptionPane.showInputDialog(menu);

            switch (opcao) {
                case "1":
                    criarOnibus(veiculosPublicos);
                    break;
                case "2":
                    criarTaxi(veiculosPublicos);
                    break;
                case "3":
                    criarBicicleta(veiculosPublicos);
                    break;
                case "4":
                    criarTrem(veiculosPublicos);
                    break;
                case "5":
                    criarPatinete(veiculosPublicos);
                    break;
                case "6":
                    mostrarVeiculos(veiculosPublicos);
                    break;
                case "7":
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    public static void criarOnibus(ArrayList<VeiculoPublico> veiculosPublicos) {
        double custoFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor fixo do Ônibus:"));
        Onibus onibus = new Onibus(custoFixo);
        veiculosPublicos.add(onibus);
        JOptionPane.showMessageDialog(null, "Ônibus cadastrado com sucesso!");
    }

    public static void criarTaxi(ArrayList<VeiculoPublico> veiculosPublicos) {
        double valorCorrida = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da corrida do Táxi:"));
        double numeroCorridas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de corridas realizadas no mês:"));
        Taxi taxi = new Taxi(0, valorCorrida, numeroCorridas);
        veiculosPublicos.add(taxi);
        JOptionPane.showMessageDialog(null, "Táxi cadastrado com sucesso!");
    }

    public static void criarBicicleta(ArrayList<VeiculoPublico> veiculosPublicos) {
        double qtdBicicleta = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de bicicletas:"));
        double custoMensalManutencao = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo mensal de manutenção por bicicleta:"));
        Bicicleta bicicleta = new Bicicleta(0, qtdBicicleta, custoMensalManutencao);
        veiculosPublicos.add(bicicleta);
        JOptionPane.showMessageDialog(null, "Bicicleta cadastrada com sucesso!");
    }

    public static void criarTrem(ArrayList<VeiculoPublico> veiculosPublicos) {
        double adicionalKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do quilômetros do Trem: "));
        int kmRodados = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de quilômetros rodados no mês:"));
        TremUrbano trem = new TremUrbano(0, adicionalKm, kmRodados);
        veiculosPublicos.add(trem);
        JOptionPane.showMessageDialog(null, "Trem cadastrado com sucesso!");
    }

    public static void criarPatinete(ArrayList<VeiculoPublico> veiculosPublicos) {
        double custoFixoHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo por hora de uso do Patinete:"));
        double horasConsumidas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas consumidas no mês:"));
        PatinsEletrico patinete = new PatinsEletrico(0, custoFixoHoras, horasConsumidas);
        veiculosPublicos.add(patinete);
        JOptionPane.showMessageDialog(null, "Patinete cadastrado com sucesso!");
    }

    public static void mostrarVeiculos(ArrayList<VeiculoPublico> veiculosPublicos) {
        if (veiculosPublicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.");
        } else {
            StringBuilder listaVeiculos = new StringBuilder("Veículos cadastrados:\n");
            for (VeiculoPublico veiculo : veiculosPublicos) {
                listaVeiculos.append(veiculo.getClass().getSimpleName())
                        .append(" - Custo Mensal: R$ ").append(veiculo.calcularGastoMensal()).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaVeiculos.toString());
        }
    }
}
