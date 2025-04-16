package classes;

public class Taxi extends Veiculo{
    private double custoVariavel;
    private int nmrCorrida;
    private double custoCorrida;

    public Taxi (double custo_fixo, int numero_corridas, double custo_corrida){
        super(custo_fixo);
        nmrCorrida = validarValor(numero_corridas);
        custoCorrida = validarValor(custo_corrida);
        custoVariavel = custoCorrida * nmrCorrida;
        custoTotal = custoFixo + custoVariavel;
    }
    public Taxi (){}

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus() + "\nNumero de corridas: "+nmrCorrida+"\nCusto de corrida: R$"+custoCorrida + "\nCusto total: R$" + custoTotal;
    }
}