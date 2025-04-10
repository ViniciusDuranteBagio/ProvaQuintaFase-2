package classes;

public class Taxi {
    private double custoFixo;
    private int numeroCorridas;
    private double custoPorCorrida;

    public Taxi(double custoFixo, int numeroCorridas, double custoPorCorrida) {
        this.custoFixo = Validador.validarValor(custoFixo);
        this.numeroCorridas = Validador.validarValor(numeroCorridas);
        this.custoPorCorrida = Validador.validarValor(custoPorCorrida);
    }

    public double calcularCustoMensal() {
        return custoFixo + (numeroCorridas * custoPorCorrida);
    }
}