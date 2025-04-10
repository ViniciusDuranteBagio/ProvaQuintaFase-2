package classes.entities;

public abstract class Veiculo {
    protected String modelo;

    public Veiculo(String name) {
        this.modelo = name;
    }

    public abstract double calcularCusto();

    public abstract String tipoVeiculo();

    @Override
    public String toString() {
        return String.format("%s%nNome: %s %Custo: %.2f", tipoVeiculo(), modelo, calcularCusto());
    }
}
