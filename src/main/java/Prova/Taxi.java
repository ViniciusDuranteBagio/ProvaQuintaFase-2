package Prova;

public class Taxi extends Veiculos {
    private double custoFixo;
    private int corridas;
    private double custoPorCorrida;

    public Taxi(String nome, double custoFixo, int corridas, double custoPorCorrida) {
        if (custoFixo < 0) {
            System.out.println("Custo fixo inválido. Usando 0.");
            custoFixo = 0;
        }
        if (corridas < 0) {
            System.out.println("Número de corridas inválido. Usando 0.");
            corridas = 0;
        }
        if (custoPorCorrida < 0) {
            System.out.println("Custo por corrida inválido. Usando 0.");
            custoPorCorrida = 0;
        }

        this.custoFixo = custoFixo;
        this.corridas = corridas;
        this.custoPorCorrida = custoPorCorrida;
    }
}
