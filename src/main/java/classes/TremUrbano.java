package classes;

public class TremUrbano extends VeiculoPublico {
    private double custoFixo;
    private double quilometrosRodados;
    private double custoPorQuilometro;

    public TremUrbano(double custoFixo, double quilometrosRodados, double custoPorQuilometro) {
        super("Trem Urbano");
        this.custoFixo = validarValor(custoFixo, "Custo fixo");
        this.quilometrosRodados = validarValor(quilometrosRodados, "Quilômetros rodados");
        this.custoPorQuilometro = validarValor(custoPorQuilometro, "Custo por quilômetro");
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (quilometrosRodados * custoPorQuilometro);
    }
}
