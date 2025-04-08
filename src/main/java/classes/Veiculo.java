package main.java.classes;

public class Veiculo {

    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double calcularCusto() {
        return 0;
    }

    public double validarEntrada(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Substituído por 0.");
            return 0;
        }
        return valor;


    }
}
