package classes;

public class Bicicleta extends VeiculoPublico {
    private double qtdBicicleta;
    private double custoMensalManutencao;

    public Bicicleta(double custoFixo,double qtdBicicleta, double custoMensalManutencao) {
        super(custoFixo);
        this.qtdBicicleta = validarValor(qtdBicicleta);
        this.custoMensalManutencao = validarValor(custoMensalManutencao);
    }

    public double getQtdBicicleta() {
        return qtdBicicleta;
    }

    public double getCustoMensalManutencao() {
        return custoMensalManutencao;
    }
    @Override
    public double calcularGastoMensal(){
        return custoFixo + (custoMensalManutencao * qtdBicicleta);
    }
}

