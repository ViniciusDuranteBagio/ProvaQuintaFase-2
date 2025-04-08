package classes;

public class Patinete extends Veiculo {
    private double horaUso;
    private double valorHora;

    public Patinete(double horaUso, double valorHora) {
        this.horaUso = validarEntrada(horaUso);
        this.valorHora = validarEntrada(valorHora);
    }

    @Override
    public double calculaValorMensal() {
        return horaUso * valorHora;
    }

}
