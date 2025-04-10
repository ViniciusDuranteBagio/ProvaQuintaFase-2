package classes;

public class Onibus extends VeiculoPublico {
    private double custoFixoMensal;

    public Onibus(double custoFixoMensal) {
        super("Ônibus");
        this.custoFixoMensal = validarValor(custoFixoMensal, "Custo fixo mensal");
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixoMensal;
    }
}
