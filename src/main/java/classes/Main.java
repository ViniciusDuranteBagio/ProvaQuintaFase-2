package classes;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Alunos:
        Kauã Oenning Kuntz
        André Becker Locks
         */

        ArrayList<Object> veiculos = new ArrayList<>();
        int opcao;

        do {
            opcao = escolherOpcao();

            switch (opcao) {
                case 1 -> cadastrarOnibus(veiculos);
                case 2 -> cadastrarTaxi(veiculos);
                case 3 -> cadastrarBicicleta(veiculos);
                case 4 -> cadastrarTrem(veiculos);
                case 5 -> cadastrarPatinete(veiculos);
                case 6 -> listarVeiculos(veiculos);
            }

        } while (opcao != 7);
    }

    private static int escolherOpcao() {
        String menu = """
                1 - Cadastrar Ônibus
                2 - Cadastrar Táxi
                3 - Cadastrar Bicicleta Compartilhada
                4 - Cadastrar Trem Urbano
                5 - Cadastrar Patinete Elétrico
                6 - Listar Veículos Cadastrados
                7 - Sair
                """;
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
        } catch (Exception e) {
            return 0;
        }
    }

    private static void cadastrarOnibus(ArrayList<Object> lista) {
        double custoFixo = lerDouble("Informe o custo fixo mensal:");
        Onibus onibus = new Onibus(custoFixo);
        lista.add(onibus);

        JOptionPane.showMessageDialog(null, "Ônibus cadastrado!\nCusto: R$ " + onibus.calcularCustoMensal());
    }

    private static void cadastrarTaxi(ArrayList<Object> lista) {
        double fixo = lerDouble("Custo fixo mensal:");
        int corridas = lerInt("Número de corridas no mês:");
        double custoPorCorrida = lerDouble("Custo por corrida:");

        Taxi taxi = new Taxi(fixo, corridas, custoPorCorrida);
        lista.add(taxi);

        JOptionPane.showMessageDialog(null, "Táxi cadastrado!\nCusto: R$ " + taxi.calcularCustoMensal());
    }

    private static void cadastrarBicicleta(ArrayList<Object> lista) {
        int qtd = lerInt("Quantidade de bicicletas:");
        double custo = lerDouble("Custo mensal por bicicleta:");

        BicicletaCompartilhada bike = new BicicletaCompartilhada(qtd, custo);
        lista.add(bike);

        JOptionPane.showMessageDialog(null, "Bicicleta cadastrada!\nCusto: R$ " + bike.calcularCustoMensal());
    }

    private static void cadastrarTrem(ArrayList<Object> lista) {
        double fixo = lerDouble("Custo fixo mensal:");
        double km = lerDouble("Km rodados no mês:");
        double custoKm = lerDouble("Custo por km:");

        TremUrbano trem = new TremUrbano(fixo, km, custoKm);
        lista.add(trem);

        JOptionPane.showMessageDialog(null, "Trem cadastrado!\nCusto: R$ " + trem.calcularCustoMensal());
    }

    private static void cadastrarPatinete(ArrayList<Object> lista) {
        double horas = lerDouble("Horas de uso no mês:");
        double custoHora = lerDouble("Custo por hora:");

        PatineteEletrico patinete = new PatineteEletrico(horas, custoHora);
        lista.add(patinete);

        JOptionPane.showMessageDialog(null, "Patinete cadastrado!\nCusto: R$ " + patinete.calcularCustoMensal());
    }

    private static void listarVeiculos(ArrayList<Object> lista) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Object obj : lista) {
                if (obj instanceof Onibus o) {
                    sb.append("Ônibus - Custo: R$ ").append(o.calcularCustoMensal()).append("\n\n");
                } else if (obj instanceof Taxi t) {
                    sb.append("Táxi - Custo: R$ ").append(t.calcularCustoMensal()).append("\n\n");
                } else if (obj instanceof BicicletaCompartilhada b) {
                    sb.append("Bicicleta Compartilhada - Custo: R$ ").append(b.calcularCustoMensal()).append("\n\n");
                } else if (obj instanceof TremUrbano tr) {
                    sb.append("Trem Urbano - Custo: R$ ").append(tr.calcularCustoMensal()).append("\n\n");
                } else if (obj instanceof PatineteEletrico p) {
                    sb.append("Patinete Elétrico - Custo: R$ ").append(p.calcularCustoMensal()).append("\n\n");
                }
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private static double lerDouble(String mensagem) {
        try {
            double valor = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "Valor negativo não permitido. O valor será substituído por 0!.");
                return 0;
            }
            return valor;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. O valor será substituído por 0!.");
            return 0;
        }
    }

    private static int lerInt(String mensagem) {
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "Valor negativo não permitido. O valor será substituído por 0!.");
                return 0;
            }
            return valor;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. O valor será substituído por 0!.");
            return 0;
        }
    }
}