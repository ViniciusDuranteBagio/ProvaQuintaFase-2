package classes;

public class Transporte {
    private String nome;

    public Transporte(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularCustoMensal() {
        return 0;
    }

    public void exibirInformacoes() {
        System.out.println("Transporte: " + nome);
        System.out.printf("Custo Mensal: R$ %.2f\n", calcularCustoMensal());
    }

    public double validar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido!!! Atribuindo valor 0.");
            return 0;
        }
        return valor;
    }

    public int validar(int valor) {
        if (valor < 0) {
            System.out.println("Valor inválido!!! Atribuindo valor 0.");
            return 0;
        }
        return valor;
    }
}
