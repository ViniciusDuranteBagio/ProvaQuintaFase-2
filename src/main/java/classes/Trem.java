package main.java.classes;

public class Trem extends Veiculo{

    private double custoFixoMensal;
    private double qtdKmRodados;
    private double adiocionalQuilometro;

    public Trem(String modelo, double custoFixoMensal, double qtdKmRodados, double adiocionalQuilometro) {
        super(modelo);
        this.custoFixoMensal = validarEntrada(custoFixoMensal);
        this.qtdKmRodados = validarEntrada(qtdKmRodados);
        this.adiocionalQuilometro = validarEntrada(adiocionalQuilometro)    ;
    }

    public double getCustoFixoMensal() {
        return custoFixoMensal;
    }

    public void setCustoFixoMensal(double custoFixoMensal) {
        this.custoFixoMensal = custoFixoMensal;
    }

    public double getQtdKmRodados() {
        return qtdKmRodados;
    }

    public void setQtdKmRodados(double qtdKmRodados) {
        this.qtdKmRodados = qtdKmRodados;
    }

    public double getAdiocionalQuilometro() {
        return adiocionalQuilometro;
    }

    public void setAdiocionalQuilometro(double adiocionalQuilometro) {
        this.adiocionalQuilometro = adiocionalQuilometro;
    }

    @Override
    public double calcularCusto() {
        return this.custoFixoMensal + (this.qtdKmRodados * this.adiocionalQuilometro);
    }
}
