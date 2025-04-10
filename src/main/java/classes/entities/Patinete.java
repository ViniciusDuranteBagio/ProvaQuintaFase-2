package classes.entities;

public class Patinete extends Veiculo{
    private double valorHora;
    private int horasUso;

    public Patinete(String nome, double valorHora, int horasUso) {
        super(nome);
        this.valorHora = valorHora;
        this.horasUso = horasUso;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasUso() {
        return horasUso;
    }
    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    @Override
    public double calcularCusto() {
        return valorHora*horasUso;
    }

    @Override
    public String tipoVeiculo() {
        return "Patinete";
    }
}
