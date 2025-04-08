package br.com.brejas.veiculos;

public class Taxi extends Veiculo{
    private int numCorridas;

    public Taxi(String nome, double custo, int numCorridas){
        super(nome, custo);
        this.numCorridas = numCorridas;
        setCusto(calcular());
    }

    public Taxi(){};

    @Override
    public double calcular() {
        return getCusto() + numCorridas;
    }
}
