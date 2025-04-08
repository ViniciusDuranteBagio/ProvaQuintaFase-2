package classes;

import javax.swing.*;

public class Onibus {

    private double custoFixo;

    public Onibus(double custoFixo) {
        this.custoFixo = custoFixo >= 0 ? custoFixo : 0;
        if (custoFixo < 0) {
            JOptionPane.showMessageDialog(null, "Custo fixo inválido! Atribuído valor 0.");
        }
    }

    public double calcularCustoMensal() {
        return custoFixo;
    }
}