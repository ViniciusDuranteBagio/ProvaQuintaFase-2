package classes;

public class Onibus extends Veiculo{

    public Onibus (double custo_fixo){
        super(custo_fixo);
        m_custo_total = m_custo_fixo;
    }
    public Onibus (){}
}
