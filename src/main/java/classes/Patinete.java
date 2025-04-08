package main.java.classes;

public class Patinete extends Veiculo{

    private int qtdHorasUso;
    private double custoPorHora;

    public Patinete(String modelo, int qtdHorasUso, double custoPorHora) {
        super(modelo);
        this.qtdHorasUso = (int) validarEntrada(qtdHorasUso);
        this.custoPorHora = validarEntrada(custoPorHora);
    }

    public int getQtdHorasUso() {
        return qtdHorasUso;
    }

    public void setQtdHorasUso(int qtdHorasUso) {
        this.qtdHorasUso = qtdHorasUso;
    }

    public double getCustoPorHora() {
        return custoPorHora;
    }

    public void setCustoPorHora(double custoPorHora) {
        this.custoPorHora = custoPorHora;
    }

    @Override
    public double calcularCusto() {
        return this.qtdHorasUso * this.custoPorHora;
    }
}
