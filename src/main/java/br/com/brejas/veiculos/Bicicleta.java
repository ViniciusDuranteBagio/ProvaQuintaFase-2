package br.com.brejas.veiculos;

public class Bicicleta extends Veiculo{
    private int qtdBicicleta;
    private double ctManutencao;

    public Bicicleta(String nome, double custo, int qtdBicicleta, double ctManutencao){
        super(nome, custo);
        this.qtdBicicleta = qtdBicicleta;
        this.ctManutencao = ctManutencao;
        setCusto(calcular());
    }

    public Bicicleta(){};

    @Override
    public double calcular() {
        return getCusto() + (ctManutencao * qtdBicicleta);
    }
}
