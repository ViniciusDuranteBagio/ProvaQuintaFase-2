package classes.entities;

public class TremUrbano extends Veiculo{
    private double custoFixo;
    private int kmRodados;
    private double valorPorKm;

    public TremUrbano(String modelo, double custoFixo, int kmRodados, double valorPorKm){
        super(modelo);
        this.custoFixo = custoFixo;
        this.kmRodados = kmRodados;
        this.valorPorKm = valorPorKm;
    }

    public double getCustoFixo() {
        return custoFixo;
    }
    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }
    public int getKmRodados() {
        return kmRodados;
    }
    public void setKmRodados(int qtdCorridas) {
        this.kmRodados = qtdCorridas;
    }
    public double getValorPorKm() {
        return valorPorKm;
    }
    public void setValorPorKm(double valorCorridas) {
        this.valorPorKm = valorCorridas;
    }

    @Override
    public double calcularCusto() {
        return custoFixo + (kmRodados*valorPorKm);
    }

    @Override
    public String tipoVeiculo() {
        return "Trem Urbano";
    }
}
