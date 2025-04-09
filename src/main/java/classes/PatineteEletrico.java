package classes;
import java.math.BigDecimal;


public class PatineteEletrico extends Veiculo {

    private BigDecimal custoPorHora;
    private int horasDeUso;

    public PatineteEletrico(BigDecimal custo, int horasDeUso) {
        super(custo);
        this.horasDeUso = horasDeUso;
    }

    @Override
    public BigDecimal calculaCustoMensal() {
        return custo.multiply(BigDecimal.valueOf(horasDeUso));
    }
}