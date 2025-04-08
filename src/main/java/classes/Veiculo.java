package classes;

public class Veiculo {
    protected double m_custo_fixo;

    public double getM_custo_fixo() {
        return m_custo_fixo;
    }

    public double getM_custo_total() {
        return m_custo_total;
    }

    protected double m_custo_total;

    public Veiculo (double custo_fixo) {
        m_custo_fixo = validarValor(custo_fixo);
    }
    public Veiculo() {}

    public double validarValor(double valor){
        if (valor >= 0){
            return valor;
        }
        else {
            System.out.println("valor negativo não é permitido");
            return 0.0;
        }
    }

    public int validarValor(int valor){
        if (valor >= 0){
            return valor;
        }
        else {
            System.out.println("valor negativo não é permitido");
            return 0;
        }
    }

    public String mostrarStatus() {
        return "Custo fixo: " + m_custo_fixo;
    }
}
