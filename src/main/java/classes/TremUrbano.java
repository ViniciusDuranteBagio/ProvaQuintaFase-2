package classes;

import javax.swing.JOptionPane;

public class TremUrbano {
    private double custoFixo;
    private double quilometrosRodados;
    private double custoPorQuilometro;

    public TremUrbano(double custoFixo, double quilometrosRodados, double custoPorQuilometro) {
        this.custoFixo = custoFixo >= 0 ? custoFixo : 0;
        this.quilometrosRodados = quilometrosRodados >= 0 ? quilometrosRodados : 0;
        this.custoPorQuilometro = custoPorQuilometro >= 0 ? custoPorQuilometro : 0;

        if (custoFixo < 0) JOptionPane.showMessageDialog(null, "Custo fixo inválido! Atribuído valor 0.");
        if (quilometrosRodados < 0) JOptionPane.showMessageDialog(null, "Quilômetros inválidos! Atribuído valor 0.");
        if (custoPorQuilometro < 0) JOptionPane.showMessageDialog(null, "Custo por km inválido! Atribuído valor 0.");
    }

    public double calcularCustoMensal() {
        return custoFixo + (quilometrosRodados * custoPorQuilometro);
    }
}