package classes;

import javax.swing.*;

public class Validacoes {
    private static double receberDouble(String mensagem, String erro) {
        String valorStr = JOptionPane.showInputDialog(mensagem);
        if (valorStr == null || valorStr.trim().isEmpty() || !isNumeric(valorStr)) {
            JOptionPane.showMessageDialog(null, erro);
            return receberDouble(mensagem, erro);
        }
        double valor = Double.parseDouble(valorStr);
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Não pode ser negativo. Atribuindo 0.");
            return 0;
        }
        return valor;
    }


    private static int receberInt(String mensagem, String erro) {
        String valorStr = JOptionPane.showInputDialog(mensagem);
        if (valorStr == null || valorStr.trim().isEmpty() || !isInteger(valorStr)) {
            JOptionPane.showMessageDialog(null, erro);
            return receberInt(mensagem, erro);
        }
        int valor = Integer.parseInt(valorStr);
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Não pode ser negativo. Atribuindo 0.");
            return 0;
        }
        return valor;
    }

    public static String receberNome() {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
            return receberNome();
        } else {
            return nome;
        }
    }

    public static double receberCustoFixoOnibus() {
        return receberDouble("Digite o custo fixo mensal do ônibus:",
                "Custo fixo inválido!");
    }

    public static double receberCustoFixoTaxi() {
        return receberDouble("Digite o custo fixo mensal do táxi:",
                "Custo fixo inválido!");
    }

    public static int receberNumeroCorridasTaxi() {
        return receberInt("Digite o número de corridas realizadas pelo táxi no mês:",
                "Número de corridas inválido!");
    }

    public static double receberCustoPorCorridaTaxi() {
        return receberDouble("Digite o custo por corrida do táxi:",
                "Custo por corrida inválido!");
    }

    public static int receberQuantidadeBicicletas() {
        return receberInt("Digite a quantidade de bicicletas compartilhadas:",
                "Quantidade de bicicletas inválida!");
    }

    public static double receberCustoFixoBicicleta() {
        return receberDouble("Digite o custo mensal de manutenção por bicicleta:",
                "Custo de manutenção inválido!");
    }

    public static double receberCustoFixoTrem() {
        return receberDouble("Digite o custo fixo mensal do trem urbano:",
                "Custo fixo inválido!");
    }

    public static double receberQuilometrosTrem() {
        return receberDouble("Digite a quantidade de quilômetros rodados pelo trem no mês:",
                "Quantidade de quilômetros inválida!");
    }

    public static double receberCustoPorKmTrem() {
        return receberDouble("Digite o custo adicional por quilômetro do trem:",
                "Custo por quilômetro inválido!");
    }

    public static double receberHorasUsoPatinete() {
        return receberDouble("Digite a quantidade de horas de uso do patinete no mês:",
                "Quantidade de horas inválida!");
    }

    public static double receberCustoFixoPatinete() {
        return receberDouble("Digite o custo por hora do patinete:",
                "Custo por hora inválido!");
    }


    private static boolean isNumeric(String str) {
        if (str == null) return false;
        str = str.trim();
        if (str.isEmpty()) return false;

        boolean hasDecimal = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.' && !hasDecimal) {
                hasDecimal = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInteger(String str) {
        if (str == null) return false;
        str = str.trim();
        if (str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
