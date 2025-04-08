package classes;

import javax.swing.*;

public class Veiculo {

    public double validarEntrada(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "valor inválido");
            return 0;
        }
        return valor;
    }

    public double calculaValorMensal() {
        return 0;
    }

}
