package classes;

public class Onibus extends Transporte {
    private double custoFixo;

    public Onibus(String nome, double custoFixo) {
        super(nome);
        this.custoFixo = validar(custoFixo);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo;
    }
}
