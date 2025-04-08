package main.java.classes;

public class Taxi extends Veiculo{

    private double custoFixo;
    private int numeroCorridas;
    private double custoCadaCorrida;

    public Taxi(String modelo, double custoFixo, int numeroCorridas, double custoCadaCorrida) {
        super(modelo);
        this.custoFixo = validarEntrada(custoFixo);
        this.numeroCorridas = (int) validarEntrada(numeroCorridas);
        this.custoCadaCorrida = validarEntrada(custoCadaCorrida);
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }

    public int getNumeroCorridas() {
        return numeroCorridas;
    }

    public void setNumeroCorridas(int numeroCorridas) {
        this.numeroCorridas = numeroCorridas;
    }

    public double getCustoCadaCorrida() {
        return custoCadaCorrida;
    }

    public void setCustoCadaCorrida(double custoCadaCorrida) {
        this.custoCadaCorrida = custoCadaCorrida;
    }

    @Override
    public double calcularCusto() {
        return this.custoFixo + (this.numeroCorridas * this.custoCadaCorrida);
    }
}
