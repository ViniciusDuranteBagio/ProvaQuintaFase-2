package classes;

import java.text.DecimalFormat;

public class Veiculo {
    protected double custoFixo;

    public double getCustoFixo() {
        return custoFixo;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    protected double custoTotal;

    public Veiculo (double custo_fixo) {
        custoFixo = validarValor(custo_fixo);
    }
    public Veiculo() {}

    public double validarValor(double valor){
        if (valor >= 0){
            return valor;
        }
        else {
            System.out.println("Valores negativos não são permitidos");
            return 0.0;
        }
    }

    public int validarValor(int valor){
        if (valor >= 0){
            return valor;
        }
        else {
            System.out.println("Valores negativos não são permitidos");
            return 0;
        }
    }

    public String mostrarStatus() {
        return "Custo fixo: R$" + custoFixo;
    }
}