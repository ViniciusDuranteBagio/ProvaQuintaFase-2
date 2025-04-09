package classes;

public class Onibus extends Veiculo{

    public Onibus() {
    }

    @Override
    public double calcularCusto() {
        return custoFixo;
    }
}
