package classes;

public class PatineteEletrico extends Veiculo {
    public double horasUso;

    public PatineteEletrico() {
    }

    @Override
    public double calcularCusto() {
        return custoFixo * horasUso;
    }

    public double getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(double horasUso) {
        if (horasUso < 0) {
            System.out.println("Horas de uso não pode ser negativo");
            this.horasUso = 0;
        } else {
            this.horasUso = horasUso;
        }
    }
}

