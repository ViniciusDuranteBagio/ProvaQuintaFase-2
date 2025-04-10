package classes;

public class BicicletaCompartilhada {
    private int quantidadeBicicletas;
    private double custoPorBicicleta;

    public BicicletaCompartilhada(int quantidadeBicicletas, double custoPorBicicleta) {
        this.quantidadeBicicletas = Validador.validarValor(quantidadeBicicletas);
        this.custoPorBicicleta = Validador.validarValor(custoPorBicicleta);
    }

    public double calcularCustoMensal() {
        return quantidadeBicicletas * custoPorBicicleta;
    }
}
