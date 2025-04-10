package classes;

public class Taxi extends VeiculoPublico {
    private double custoFixo;
    private int numeroCorridas;
    private double custoPorCorrida;

    public Taxi(double custoFixo, int numeroCorridas, double custoPorCorrida) {
        super("Táxi");
        this.custoFixo = validarValor(custoFixo, "Custo fixo");
        this.numeroCorridas = (int) validarValor(numeroCorridas, "Número de corridas");
        this.custoPorCorrida = validarValor(custoPorCorrida, "Custo por corrida");
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (numeroCorridas * custoPorCorrida);
    }
}
