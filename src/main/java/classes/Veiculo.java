package classes;

import javax.swing.*;

public abstract class Veiculo {
    protected String nome;
    protected double custoFixo;

    public abstract double calcularCusto();

    public String exibirInfo(){
        return "Nome: " + this.nome + ", custo mensal : R$" + calcularCusto();
    }

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        if (custoFixo < 0) {
            System.out.println("Custo não pode ser negativo!");
            this.custoFixo = 0;
        } else {
            this.custoFixo = custoFixo;
        }
    }
}
