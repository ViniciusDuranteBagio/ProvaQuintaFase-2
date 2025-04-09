package classes;

import java.math.BigDecimal;

public class TremUrbano extends Veiculo {
    private BigDecimal custoPorKm;
    private int kmRodados;

    public TremUrbano(BigDecimal custo, BigDecimal custoPorKm, int kmRodados) {
        super(custo);
        if (custoPorKm.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Custo por Km negativo, valor zero atribuido");
            custoPorKm = BigDecimal.ZERO;
        }
        this.custoPorKm = custoPorKm;
        this.kmRodados = kmRodados < 0 ? 0 : kmRodados;
    }

    @Override
    public BigDecimal calculaCustoMensal() {
        return custo.add(custoPorKm.multiply(BigDecimal.valueOf(kmRodados)));
    }
}


