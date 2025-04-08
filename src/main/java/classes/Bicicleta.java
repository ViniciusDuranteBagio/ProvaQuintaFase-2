package classes;

public class Bicicleta extends Veiculo {
    private int qtde;
    private double manutencao;

    public Bicicleta(int qtde, double manutencao) {
        this.qtde = (qtde < 0) ? 0 : qtde;
        this.manutencao = validarEntrada(manutencao);
    }

    @Override
    public double calculaValorMensal() {
        return qtde * manutencao;
    }

}
