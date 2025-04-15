package classes;

public class Trem extends Veiculo{
    private int qntdKilometro;
    private double custoKilometro;

    public Trem(double custo_fixo, int quantidade_km, double custo_por_km) {
        super(custo_fixo);
        qntdKilometro = validarValor(quantidade_km);
        custoKilometro = validarValor(custo_por_km);
        custoTotal = custoFixo + qntdKilometro * custoKilometro;
    }

    public Trem() {}

    @Override
    public String mostrarStatus() {
        return super.mostrarStatus() + "\nQuantidade de Km: " + qntdKilometro + "\nCusto por Km: R$" + custoKilometro+ "\nCusto total: R$" + custoTotal;
    }
}