package Prova;

public class Veiculos {

    private String nome;
    private String marca;
    public Veiculos(){

    }
    public Veiculos(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public void cadastrarVeiculo(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
    }
}
