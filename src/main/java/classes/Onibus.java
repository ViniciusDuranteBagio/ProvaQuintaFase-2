package classes;

public class Onibus extends VeiculoPublico {
    private double custoFixo;

    public Onibus(double custoFixo) {
        this.custoFixo = validar(custoFixo);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo;
    }
}

