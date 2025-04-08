package classes;

public class Trem extends Veiculo {
    private double valorFixo;
    private double kmRodado;
    private double valorKm;

    public Trem(double valorFixo, double kmRodado, double valorKm) {
        this.valorFixo = validarEntrada(valorFixo);
        this.kmRodado = validarEntrada(kmRodado);
        this.valorKm = validarEntrada(valorKm);
    }

    @Override
    public double calculaValorMensal() {
        return valorFixo + (kmRodado * valorKm);
    }

}
