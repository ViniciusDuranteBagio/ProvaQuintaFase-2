package classes;

import java.math.BigDecimal;

public class BicicletaCompartilhada extends Veiculo {

    protected int quantidadeBicicletas;
    protected BigDecimal custoManutencaoPorUnidade;

    public BicicletaCompartilhada(BigDecimal custo,  int quantidadeBicicletas) {
        super(custo);
        this.quantidadeBicicletas = quantidadeBicicletas < 0 ?  0 : quantidadeBicicletas;
    }

    @Override
    public BigDecimal calculaCustoMensal() {
        return custo.multiply(BigDecimal.valueOf(this.quantidadeBicicletas));
    }


}
