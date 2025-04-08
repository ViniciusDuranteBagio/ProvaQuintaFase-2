package br.com.brejas.veiculos;

public class Onibus extends Veiculo{

    public Onibus(String nome, double custo){
        super(nome, custo);
    }

    public Onibus(){};

    @Override
    public double calcular() {
        return 0;
    }



}
