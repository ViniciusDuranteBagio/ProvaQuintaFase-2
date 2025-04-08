package classes;

public class TremUrbano extends Transporte {
    private double custoFixo;
    private double kmRodados;
    private double custoPorKm;

    public TremUrbano(String nome, double custoFixo, double kmRodados, double custoPorKm) {
        super(nome);
        this.custoFixo = validar(custoFixo);
        this.kmRodados = validar(kmRodados);
        this.custoPorKm = validar(custoPorKm);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (kmRodados * custoPorKm);
    }
}
