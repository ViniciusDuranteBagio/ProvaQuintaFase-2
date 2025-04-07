package classes;

public class TremUrbano extends VeiculoPublico {
    private double kmRodados;
    private double adicionalKm;

    public TremUrbano(double custoFixo, double adicionalKm, double kmRodados) {
        super( custoFixo);
        this.adicionalKm = validarValor(adicionalKm);
        this.kmRodados = validarValor(kmRodados);
    }

    public double getKmRodados() {
        return kmRodados;
    }
    @Override
    public double calcularGastoMensal(){
        return custoFixo + (kmRodados * adicionalKm);
    }
}
