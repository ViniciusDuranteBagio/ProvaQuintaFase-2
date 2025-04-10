package classes.entities;

public class Bicicletas extends Veiculo{
    private int qtdBiciletas;
    private double manutencaoMensal;

    public Bicicletas(String name, int qtdBiciletas, double manutencaoMensal) {
        super(name);
        this.qtdBiciletas = qtdBiciletas;
        this.manutencaoMensal = manutencaoMensal;
    }

    public int getQtdBiciletas() {
        return qtdBiciletas;
    }

    public void setQtdBiciletas(int qtdBiciletas) {
        this.qtdBiciletas = qtdBiciletas;
    }

    public double getManutencaoMensal() {
        return manutencaoMensal;
    }

    public void setManutencaoMensal(double manutencaoMensal) {
        this.manutencaoMensal = manutencaoMensal;
    }

    @Override
    public double calcularCusto() {
        return qtdBiciletas*manutencaoMensal;
    }

    @Override
    public String tipoVeiculo() {
        return "Bicicleta Compartilhada";
    }

    
    
}
