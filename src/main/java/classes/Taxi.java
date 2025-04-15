package classes;

public class Taxi extends VeiculoPublico {
    private double custoFixo;
    private int numCorridas;
    private double custoCorrida;

    public Taxi(double custoFixo, int numCorridas, double custoCorrida) {
        this.custoFixo = custoFixo < 0 ? 0 : custoFixo;
        this.numCorridas = Math.max(numCorridas, 0);
        this.custoCorrida = custoCorrida < 0 ? 0 : custoCorrida;
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (numCorridas * custoCorrida);
    }
}
