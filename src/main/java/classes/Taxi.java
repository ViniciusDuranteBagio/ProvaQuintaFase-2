package classes;

public class Taxi extends Veiculo{

    private int qntCorridas;
    private double custoCorrida;

    public Taxi() {
    }

    public double custoTaxi(){
        return qntCorridas * custoCorrida;
    }

    @Override
    public double calcularCusto() {
        return custoFixo + custoTaxi();
    }

    public int getQntCorridas() {
        return qntCorridas;
    }

    public void setQntCorridas(int qntCorridas) {
        if (qntCorridas < 0) {
            System.out.println("Quantidade de corridas não pode ser negativo");
            this.qntCorridas = 0;
        } else {
            this.qntCorridas = qntCorridas;
        }
    }

    public double getCustoCorrida() {
        return custoCorrida;
    }

    public void setCustoCorrida(double custoCorrida) {
        if (custoCorrida < 0) {
            System.out.println("Custo da corrida não pode ser negativo!");
            this.custoCorrida = 0;
        } else {
            this.custoCorrida = custoCorrida;
        }
    }
}
