package classes;

public class Trem extends Veiculo{
    private int m_quantidade_km;
    private double m_custo_por_km;

    public Trem(double custo_fixo, int quantidade_km, double custo_por_km) {
        super(custo_fixo);
        m_quantidade_km = validarValor(quantidade_km);
        m_custo_por_km = validarValor(custo_por_km);
        m_custo_total = m_custo_fixo + m_quantidade_km * m_custo_por_km;
    }

    public Trem() {}

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus() + "\nQuantidade de Km: " + m_quantidade_km + "\nCusto por Km: " + m_custo_por_km+ "\nCusto total: " + m_custo_total;
    }
}
