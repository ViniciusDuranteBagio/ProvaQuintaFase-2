package classes;

import javax.swing.*;

public class BicicletaCompartilhada {
    private int quantidadeBicicletas;
    private double custoManutencaoPorUnidade;

    public BicicletaCompartilhada(int quantidadeBicicletas, double custoManutencaoPorUnidade) {
        this.quantidadeBicicletas = quantidadeBicicletas >= 0 ? quantidadeBicicletas : 0;
        this.custoManutencaoPorUnidade = custoManutencaoPorUnidade >= 0 ? custoManutencaoPorUnidade : 0;

        if (quantidadeBicicletas < 0) JOptionPane.showMessageDialog(null, "Quantidade inválida! Atribuído valor 0.");
        if (custoManutencaoPorUnidade < 0) JOptionPane.showMessageDialog(null, "Custo de manutenção inválido! Atribuído valor 0.");
    }

    public double calcularCustoMensal() {
        return quantidadeBicicletas * custoManutencaoPorUnidade;
    }
}
