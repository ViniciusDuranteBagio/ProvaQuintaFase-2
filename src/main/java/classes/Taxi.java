package classes;

public class Taxi extends Veiculo{
    private double m_custo_variavel;
    private int m_numero_corrida;
    private double m_custo_corrida;

    public Taxi (double custo_fixo, int numero_corridas, double custo_corrida){
        super(custo_fixo);
        m_numero_corrida = validarValor(numero_corridas);
        m_custo_corrida = validarValor(custo_corrida);
        m_custo_variavel = m_custo_corrida * m_numero_corrida;
        m_custo_total = m_custo_fixo + m_custo_variavel;
    }
    public Taxi (){}

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus() + "\nNumero de corridas: "+m_numero_corrida+"\nCusto de corrida: "+m_custo_corrida + "\nCusto total: " + m_custo_total;
    }
}
