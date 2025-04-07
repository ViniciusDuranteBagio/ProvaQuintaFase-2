package classes;

public class Onibus extends VeiculoPublico{

    public Onibus(double custoFixo) {
        super(custoFixo);
    }
    @Override
    public double calcularGastoMensal(){
        return custoFixo;
    }
}
