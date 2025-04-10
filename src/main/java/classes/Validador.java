package classes;

import javax.swing.JOptionPane;

public class Validador {
    public static double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será considerado 0.");
            return 0;
        }
        return valor;
    }

    public static int validarValor(int valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será considerado 0.");
            return 0;
        }
        return valor;
    }
}
