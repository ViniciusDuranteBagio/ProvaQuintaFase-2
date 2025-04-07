package classes;

import javax.swing.*;

public class VeiculoPublico {
    protected double custoFixo;

    public VeiculoPublico(double custoFixo) {
        this.custoFixo = validarValor(custoFixo);
    }

    public static double validarValor(double valor) {
        if ( valor < 0 ) {
            JOptionPane.showMessageDialog(null,"Valor inferior a 0. Setado como 0");
            return 0;
        }
        return valor;
    }
    public double calcularGastoMensal(){
        return custoFixo;
    }
}
