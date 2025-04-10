package classes;

public class PatineteEletrico extends VeiculoPublico {
    private double horasUso;
    private double custoPorHora;

    public PatineteEletrico(double horasUso, double custoPorHora) {
        super("Patinete Elétrico");
        this.horasUso = validarValor(horasUso, "Horas de uso");
        this.custoPorHora = validarValor(custoPorHora, "Custo por hora");
    }

    @Override
    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }
}
