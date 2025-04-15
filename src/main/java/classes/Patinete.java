package classes;

public class Patinete extends VeiculoPublico {
    private int horasUso;
    private double custoPorHora;

    public Patinete(int horasUso, double custoPorHora) {
        this.horasUso = Math.max(horasUso, 0);
        this.custoPorHora = validar(custoPorHora);
    }

    @Override
    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }
}
