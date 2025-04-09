package classes;

public class TremUrbano extends Veiculo {
    public double quilometrosMes;
    public double valorKm;

    @Override
    public double calcularCusto() {
        return quilometrosMes * valorKm + custoFixo;
    }

    public TremUrbano() {
    }

    public double getQuilometrosMes() {
        return quilometrosMes;
    }

    public void setQuilometrosMes(double quilometrosMes) {
        if (quilometrosMes < 0) {
            System.out.println("Quilômetros percorridos não pode ser negativo");
            this.quilometrosMes = 0;
        } else {
            this.quilometrosMes = quilometrosMes;
        }
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        if (valorKm < 0) {
            System.out.println("Valor por Km não pode ser negativo");
            this.valorKm = 0;
        } else {
            this.valorKm = valorKm;
        }
    }
}

