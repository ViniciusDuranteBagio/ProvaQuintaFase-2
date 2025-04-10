package classes.entities;

public class Taxi extends Veiculo{
    private double custoFixo;
    private int qtdCorridas;
    private double valorCorridas;

    public Taxi(String modelo, double custoFixo, int qtdCorridas, double valorCorridas) {
        super(modelo);
        this.custoFixo = custoFixo;
        this.qtdCorridas = qtdCorridas;
        this.valorCorridas = valorCorridas;
    }

    public double getCustoFixo() {
        return custoFixo;
    }
    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }
    public int getQtdCorridas() {
        return qtdCorridas;
    }
    public void setQtdCorridas(int qtdCorridas) {
        this.qtdCorridas = qtdCorridas;
    }
    public double getValorCorridas() {
        return valorCorridas;
    }
    public void setValorCorridas(double valorCorridas) {
        this.valorCorridas = valorCorridas;
    }

    @Override
    public double calcularCusto() {
        return custoFixo + (qtdCorridas*valorCorridas);
    }

    @Override
    public String tipoVeiculo() {
        return "Taxi";
    }
}
