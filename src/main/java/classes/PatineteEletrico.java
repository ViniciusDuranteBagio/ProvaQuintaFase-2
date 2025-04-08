package classes;

import javax.swing.*;

public class PatineteEletrico {
    private double horasUso;
    private double custoPorHora;

    public PatineteEletrico(double horasUso, double custoPorHora) {
        this.horasUso = horasUso >= 0 ? horasUso : 0;
        this.custoPorHora = custoPorHora >= 0 ? custoPorHora : 0;

        if (horasUso < 0) JOptionPane.showMessageDialog(null, "Horas de uso inválidas! Atribuído valor 0.");
        if (custoPorHora < 0) JOptionPane.showMessageDialog(null, "Custo por hora inválido! Atribuído valor 0.");
    }

    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }
}
