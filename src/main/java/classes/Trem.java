package classes;

public class Trem extends VeiculoPublico {
    private double custoFixo;
    private double kmPercorridos;
    private double custoPorKm;

    public Trem(double custoFixo, double kmPercorridos, double custoPorKm) {
        this.custoFixo = validar(custoFixo);
        this.kmPercorridos = validar(kmPercorridos);
        this.custoPorKm = validar(custoPorKm);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (kmPercorridos * custoPorKm);
    }
}
