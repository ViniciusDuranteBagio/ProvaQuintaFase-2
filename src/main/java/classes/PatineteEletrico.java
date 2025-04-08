package classes;

public class PatineteEletrico extends Transporte {
    private double horasUso;
    private double custoPorHora;

    public PatineteEletrico(String nome, double horasUso, double custoPorHora) {
        super(nome);
        this.horasUso = validar(horasUso);
        this.custoPorHora = validar(custoPorHora);
    }

    @Override
    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }
}
