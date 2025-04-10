package classes;

public class PatineteEletrico {
    private double horasUso;
    private double custoPorHora;

    public PatineteEletrico(double horasUso, double custoPorHora) {
        this.horasUso = Validador.validarValor(horasUso);
        this.custoPorHora = Validador.validarValor(custoPorHora);
    }

    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }
}