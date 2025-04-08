package br.com.brejas.veiculos;

public class Patinete extends Veiculo{
    private double horasUso, custoHoras;

    public Patinete(String nome, double horasUso, double custoHoras){
        super(nome, 0);
        this.custoHoras = custoHoras;
        this.horasUso = horasUso;
        setCusto(calcular());
    }

    public Patinete(){};

    @Override
    public double calcular() {
        return horasUso * custoHoras;
    }
}
