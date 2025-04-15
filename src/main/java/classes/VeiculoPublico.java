package classes;

public abstract class VeiculoPublico {
    public abstract double calcularCustoMensal();

    protected double validar(double valor) {
        return valor < 0 ? 0 : valor;
    }
}
