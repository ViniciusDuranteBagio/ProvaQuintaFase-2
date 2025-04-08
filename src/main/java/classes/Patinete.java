package classes;

public class Patinete extends Veiculo{

    private int m_quantidade_Hora;
    private double m_custo_Hora;

    public Patinete(int quantidade_Hora, double custo_Hora) {
        m_quantidade_Hora = validarValor(quantidade_Hora);
        m_custo_Hora = validarValor(custo_Hora);
        m_custo_total = m_quantidade_Hora * m_custo_Hora;
    }
    public Patinete(){}

    @Override
    public String mostrarStatus() {
        return "Horas mensais: "+m_quantidade_Hora+"\nCusto por hora: "+m_custo_Hora+ "\nCusto total: " + m_custo_total;
    }
}
