package classes;

public class Taxi extends Veiculo {
    private double valorFixo;
    private int numCorridas;
    private double valorCorrida;

    public Taxi(double valorFixo, int numCorridas, double valorCorrida) {
        this.valorFixo = validarEntrada(valorFixo);
        this.numCorridas = (numCorridas < 0) ? 0 : numCorridas;
        this.valorCorrida = validarEntrada(valorCorrida);
    }

    @Override
    public double calculaValorMensal() {
        return valorFixo + (numCorridas * valorCorrida);
    }

}
