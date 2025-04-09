package classes;

public class BicicletaCompartilhada extends Veiculo {
    private int qntBicicletas;

    @Override
    public double calcularCusto() {
        return qntBicicletas * custoFixo;
    }

    public BicicletaCompartilhada() {
    }

    public int getQntBicicletas() {
        return qntBicicletas;
    }

    public void setQntBicicletas(int qntBicicletas) {
        if (qntBicicletas < 0) {
            System.out.println("Quantidade de biciletas não pode ser negativo");
            this.qntBicicletas = 0;
        } else {
            this.qntBicicletas = qntBicicletas;
        }
    }
}

