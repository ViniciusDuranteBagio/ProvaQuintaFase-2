package classes;

public class BicicletaCompartilhada extends VeiculoPublico {
    private int quantidade;
    private double custoManutencao;

    public BicicletaCompartilhada(int quantidade, double custoManutencao) {
        this.quantidade = Math.max(quantidade, 0);
        this.custoManutencao = validar(custoManutencao);
    }

    @Override
    public double calcularCustoMensal() {
        return quantidade * custoManutencao;
    }
}
