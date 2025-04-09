package classes;

import java.math.BigDecimal;

public class Taxi extends Veiculo {
    private BigDecimal custoVariavel;
    private int numCorridas;

    public Taxi(BigDecimal custoFixo, BigDecimal custoVariavel, int numCorridas) {
        super(custoFixo);
        if (custoVariavel.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Custo variável negativo, valor zero atribuido");
            custoVariavel = BigDecimal.ZERO;
        }
        this.custoVariavel = custoVariavel;
        this.numCorridas = numCorridas < 0 ? 0 : numCorridas;
    }

    @Override
    public BigDecimal calculaCustoMensal() {
        return custo.add(custoVariavel.multiply(BigDecimal.valueOf(numCorridas)));
    }
}