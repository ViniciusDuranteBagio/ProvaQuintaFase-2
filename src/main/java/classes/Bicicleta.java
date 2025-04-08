package main.java.classes;

public class Bicicleta extends Veiculo{

    private int qtdDeBicicletas;
    private double custoManutencaoUnidade;


    public Bicicleta(String modelo, int qtdDeBicicletas, double custoManutencaoUnidade) {
        super(modelo);
        this.qtdDeBicicletas = (int) validarEntrada(qtdDeBicicletas);
        this.custoManutencaoUnidade = validarEntrada(custoManutencaoUnidade);
    }

    public int getQtdDeBicicletas() {
        return qtdDeBicicletas;
    }

    public void setQtdDeBicicletas(int qtdDeBicicletas) {
        this.qtdDeBicicletas = qtdDeBicicletas;
    }

    public double getCustoManutencaoUnidade() {
        return custoManutencaoUnidade;
    }

    public void setCustoManutencaoUnidade(double custoManutencaoUnidade) {
        this.custoManutencaoUnidade = custoManutencaoUnidade;
    }

    @Override
    public double calcularCusto() {
        return this.qtdDeBicicletas * this.custoManutencaoUnidade;
    }
}
