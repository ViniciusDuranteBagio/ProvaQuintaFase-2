package classes;

public class VeiculoPublico {
    protected String tipo;

    public VeiculoPublico(String tipo) {
        this.tipo = tipo;
    }
    public double calcularCustoMensal() {
        System.out.println("Cálculo de custo mensal não definido para veículo genérico.");
        return 0.0;
    }
    public String getTipo() {
        return tipo;
    }

    protected double validarValor(double valor, String nomeCampo) {
        if (valor < 0) {
            System.out.println("Erro: " + nomeCampo + " não pode ser negativo. Atribuindo valor 0.");
            return 0;
        }
        return valor;
    }
}
