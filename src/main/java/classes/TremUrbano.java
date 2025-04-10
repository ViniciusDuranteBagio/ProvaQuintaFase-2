package classes;

public class TremUrbano {
    private double custoFixo;
    private double kmRodados;
    private double custoPorKm;

    public TremUrbano(double custoFixo, double kmRodados, double custoPorKm) {
        this.custoFixo = Validador.validarValor(custoFixo);
        this.kmRodados = Validador.validarValor(kmRodados);
        this.custoPorKm = Validador.validarValor(custoPorKm);
    }

    public double calcularCustoMensal() {
        return custoFixo + (kmRodados * custoPorKm);
    }
}
