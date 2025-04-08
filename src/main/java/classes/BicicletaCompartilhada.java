package classes;

public class BicicletaCompartilhada extends Transporte {
    private int quantidade;
    private double custoManutencaoPorUnidade;

    public BicicletaCompartilhada(String nome, int quantidade, double custoManutencaoPorUnidade) {
        super(nome);
        this.quantidade = validar(quantidade);
        this.custoManutencaoPorUnidade = validar(custoManutencaoPorUnidade);
    }

    @Override
    public double calcularCustoMensal() {
        return quantidade * custoManutencaoPorUnidade;
    }
}
