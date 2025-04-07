package classes;

public class PatinsEletrico extends VeiculoPublico{
    private double custoFixoHoras;
    private double horasConsumidas;

    public PatinsEletrico(double custoFixo ,double custoFixoHoras, double horasConsumidas) {
        super(custoFixo);
        this.custoFixoHoras = validarValor(custoFixoHoras);
        this.horasConsumidas = validarValor(horasConsumidas);
    }

    public double getCustoFixoHoras() {
        return custoFixoHoras;
    }

    public double getHorasConsumidas() {
        return horasConsumidas;
    }

    public double calcularGastoMensal(){
        return custoFixo + (horasConsumidas * custoFixoHoras);
    }
}
