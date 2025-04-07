package classes;

public class Taxi extends VeiculoPublico {
    public double numeroCorridas;
    private double valorCorrida;

    public Taxi(double custoFixo, double valorCorrida, double numeroCorridas) {
        super( custoFixo);

        this.valorCorrida = validarValor(valorCorrida);
        this.numeroCorridas = validarValor(numeroCorridas);
    }

    public double getNumeroCorridas() {
        return numeroCorridas;
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public double getValorCorrida(){
        return valorCorrida;
    }

    @Override
    public double calcularGastoMensal(){
        return custoFixo + (valorCorrida * numeroCorridas);
    }
}

