package classes;

public class Onibus {
    private double custoFixo;

    public Onibus(double custoFixo) {
        this.custoFixo = Validador.validarValor(custoFixo);
    }

    public double calcularCustoMensal() {
        return custoFixo;
    }
}