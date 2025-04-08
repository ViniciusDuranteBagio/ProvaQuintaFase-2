package main.java.classes;

public class Onibus extends Veiculo{

    private double custoFixoMensal;

    public Onibus(String modelo, double custoFixoMensal) {
        super(modelo);
        this.custoFixoMensal = validarEntrada(custoFixoMensal);
    }

    public double getCustoFixoMensal() {
        return custoFixoMensal;
    }

    public void setCustoFixoMensal(double custoFixoMensal) {
        this.custoFixoMensal = custoFixoMensal;
    }

    @Override
    public double calcularCusto() {
        return this.custoFixoMensal;
    }
}
