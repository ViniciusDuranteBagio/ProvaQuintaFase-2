package classes;

public class Onibus extends Veiculo {
    private double valorFixo;

    public Onibus(double valorFixo) {
        this.valorFixo = validarEntrada(valorFixo);
    }

    @Override
    public double calculaValorMensal() {
        return valorFixo;
    }

}
