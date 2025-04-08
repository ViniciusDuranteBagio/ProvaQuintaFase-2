package classes;

import javax.swing.*;

public class Taxi {
    private double custoFixo;
    private int numeroCorridas;
    private double custoPorCorrida;

    public Taxi(double custoFixo, int numeroCorridas, double custoPorCorrida) {
        this.custoFixo = custoFixo >= 0 ? custoFixo : 0;
        this.numeroCorridas = numeroCorridas >= 0 ? numeroCorridas : 0;
        this.custoPorCorrida = custoPorCorrida >= 0 ? custoPorCorrida : 0;

        if (custoFixo < 0) JOptionPane.showMessageDialog(null, "Custo fixo inválido! Atribuído valor 0.");
        if (numeroCorridas < 0) JOptionPane.showMessageDialog(null, "Número de corridas inválido! Atribuído valor 0.");
        if (custoPorCorrida < 0) JOptionPane.showMessageDialog(null, "Custo por corrida inválido! Atribuído valor 0.");
    }

    public double calcularCustoMensal() {
        return custoFixo + (numeroCorridas * custoPorCorrida);
    }
}