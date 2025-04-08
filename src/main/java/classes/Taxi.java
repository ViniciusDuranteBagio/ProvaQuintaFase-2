package classes;

public class Taxi extends Transporte {
    private double custoFixo;
    private int numCorridas;
    private double custoPorCorrida;

    public Taxi(String nome, double custoFixo, int numCorridas, double custoPorCorrida) {
        super(nome);
        this.custoFixo = validar(custoFixo);
        this.numCorridas = validar(numCorridas);
        this.custoPorCorrida = validar(custoPorCorrida);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (numCorridas * custoPorCorrida);
    }
}
