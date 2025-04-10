package classes;

    public class BicicletaCompartilhada extends VeiculoPublico {
        private int quantidadeBicicletas;
        private double custoManutencaoPorUnidade;

        public BicicletaCompartilhada(int quantidadeBicicletas, double custoManutencaoPorUnidade) {
            super("Bicicleta Compartilhada");
            this.quantidadeBicicletas = (int) validarValor(quantidadeBicicletas, "Quantidade de bicicletas");
            this.custoManutencaoPorUnidade = validarValor(custoManutencaoPorUnidade, "Custo de manutenção por unidade");
        }

        @Override
        public double calcularCustoMensal() {
            return quantidadeBicicletas * custoManutencaoPorUnidade;
        }
    }
