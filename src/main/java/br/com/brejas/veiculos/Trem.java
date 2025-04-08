package br.com.brejas.veiculos;

public class Trem extends Veiculo{
    private double km, valorKm;

    public Trem(String nome, double custo, double km, double valorKm){
        super(nome, custo);
        this.km = km;
        this.valorKm = valorKm;
        setCusto(calcular());
    }

    public Trem(){};

    @Override
    public double calcular() {
        return getCusto() + (km * valorKm);
    }
}
