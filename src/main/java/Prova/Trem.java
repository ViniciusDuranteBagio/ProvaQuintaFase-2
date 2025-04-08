package Prova;

public class Trem {
    private double custoFixo;
    private double kmPorRodados;
    private double custoPorKm;

    public Trem(String nome, double custoFixo, double kmRodados, double custoPorKm) {
        if (custoFixo < 0) {
            System.out.println("Custo fixo inválido. Usando 0.");
            custoFixo = 0;
        }
        if (kmRodados < 0) {
            System.out.println("Quilômetros rodados inválidos. Usando 0.");
            kmRodados = 0;
        }
        if (custoPorKm < 0) {
            System.out.println("Custo por km inválido. Usando 0.");
            custoPorKm = 0;
        }
        this.custoFixo = custoFixo;
        this.kmPorRodados = kmRodados;
        this.custoPorKm = custoPorKm;
    }
}
