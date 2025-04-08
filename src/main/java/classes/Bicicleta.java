package classes;

public class Bicicleta extends Veiculo{
    private int m_quantidade;
    private double m_custo_manutencao;

    public  Bicicleta (int quantidade, double custo_manutencao) {
        m_quantidade = validarValor(quantidade);
        m_custo_manutencao = validarValor(custo_manutencao);
        m_custo_total = m_custo_manutencao * m_quantidade;
    }
    public Bicicleta(){}

    @Override
    public String mostrarStatus() {
        return "Quantidade de bicicletas: " + m_quantidade + "\nCusto Manutenção: " + m_custo_manutencao+ "\nCusto total: " + m_custo_total;
    }
}
