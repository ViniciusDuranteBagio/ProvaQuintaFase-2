package classes;

public class Bicicleta extends Veiculo{
    private int qtdBicicleta;
    private double custoManutencaoBike;

    public  Bicicleta (int quantidade, double custoManutencao) {
        qtdBicicleta = validarValor(quantidade);
        custoManutencaoBike = validarValor(custoManutencao);
        custoTotal = custoManutencaoBike * qtdBicicleta;
    }
    public Bicicleta(){}

    @Override
    public String mostrarStatus() {
        return "Quantidade de bicicletas: " + qtdBicicleta + "\nCusto Manutenção: R$" + custoManutencaoBike+ "\nCusto total: R$" + custoTotal;
    }
}