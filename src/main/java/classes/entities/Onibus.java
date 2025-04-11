package classes.entities;

public class Onibus extends Veiculo{

    private double custoFixo;

    public Onibus(String modelo, double custoFixo) {
        super(modelo);
        this.custoFixo = custoFixo;
    }
    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }

    @Override
    public double calcularCusto() {
        return custoFixo;
    }

    @Override
    public String tipoVeiculo() {
        return "Onibus";
    }
}
