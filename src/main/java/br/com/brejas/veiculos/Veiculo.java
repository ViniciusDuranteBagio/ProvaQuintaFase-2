package br.com.brejas.veiculos;

public class Veiculo {
    private String nome;
    private double custo;

    public double calcular() {
        return 0;
    }

    public Veiculo(String nome, double custo){
        this.nome = nome;
        this.custo = custo;
    }
    public Veiculo(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
