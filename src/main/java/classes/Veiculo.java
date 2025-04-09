package classes;

import java.math.BigDecimal;

public class Veiculo {

    protected BigDecimal custo;

    public Veiculo(BigDecimal custo) {
        if (custo.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Veiculo custo negativo, valor zero atribuido");
            custo = BigDecimal.ZERO;
        }
        this.custo = custo;
    }

    public BigDecimal calculaCustoMensal(){
        return this.custo;
    }

}
