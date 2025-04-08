package Prova;

public class Bicicleta {
    private int qtd;
    private double custoDeManutencao;

    public Bicicleta(String nome, int quantidade, double custoManutencao) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida. Usando 0.");
            quantidade = 0;
        }
        if (custoManutencao < 0) {
            System.out.println("Custo de manutenção inválido. Usando 0.");
            custoManutencao = 0;
        }

        this.qtd = quantidade;
        this.custoDeManutencao = custoManutencao;
    }
}
