import javax.swing.*;

abstract class VeiculoPublico {
    public abstract double calcularCustoMensal();
}

class Onibus extends VeiculoPublico {
    private double custoFixo;

    public Onibus(double custoFixo) {
        this.custoFixo = validarValor(custoFixo);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo;
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será atribuído zero.");
            return 0;
        }
        return valor;
    }
}

class Taxi extends VeiculoPublico {
    private double custoFixo;
    private int numeroCorridas;
    private double custoPorCorrida;

    public Taxi(double custoFixo, int numeroCorridas, double custoPorCorrida) {
        this.custoFixo = validarValor(custoFixo);
        this.numeroCorridas = (int) validarValor(numeroCorridas);
        this.custoPorCorrida = validarValor(custoPorCorrida);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (numeroCorridas * custoPorCorrida);
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será atribuído zero.");
            return 0;
        }
        return valor;
    }
}

class BicicletaCompartilhada extends VeiculoPublico {
    private int quantidadeBikes;
    private double custoManutencaoPorBike;

    public BicicletaCompartilhada(int quantidadeBikes, double custoManutencaoPorBike) {
        this.quantidadeBikes = (int) validarValor(quantidadeBikes);
        this.custoManutencaoPorBike = validarValor(custoManutencaoPorBike);
    }

    @Override
    public double calcularCustoMensal() {
        return quantidadeBikes * custoManutencaoPorBike;
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será atribuído zero.");
            return 0;
        }
        return valor;
    }
}

class TremUrbano extends VeiculoPublico {
    private double custoFixo;
    private double kmRodados;
    private double custoPorKm;

    public TremUrbano(double custoFixo, double kmRodados, double custoPorKm) {
        this.custoFixo = validarValor(custoFixo);
        this.kmRodados = validarValor(kmRodados);
        this.custoPorKm = validarValor(custoPorKm);
    }

    @Override
    public double calcularCustoMensal() {
        return custoFixo + (kmRodados * custoPorKm);
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será atribuído zero.");
            return 0;
        }
        return valor;
    }
}

class PatineteEletrico extends VeiculoPublico {
    private double horasUso;
    private double custoPorHora;

    public PatineteEletrico(double horasUso, double custoPorHora) {
        this.horasUso = validarValor(horasUso);
        this.custoPorHora = validarValor(custoPorHora);
    }

    @Override
    public double calcularCustoMensal() {
        return horasUso * custoPorHora;
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Será atribuído zero.");
            return 0;
        }
        return valor;
    }
}

public class SistemaTransportePublico {
    public static void main(String[] args) {
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1 - Cadastrar Ônibus\n" +
                            "2 - Cadastrar Táxi\n" +
                            "3 - Cadastrar Bicicleta Compartilhada\n" +
                            "4 - Cadastrar Trem Urbano\n" +
                            "5 - Cadastrar Patinete Elétrico\n" +
                            "0 - Sair");

            if (opcao == null || opcao.equals("0"))
                break;

            VeiculoPublico veiculo = null;

            switch (opcao) {
                case "1":
                    double custoOnibus = Double
                            .parseDouble(JOptionPane.showInputDialog("Informe o custo fixo do ônibus:"));
                    veiculo = new Onibus(custoOnibus);
                    break;

                case "2":
                    double custoFixoTaxi = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo do táxi:"));
                    int corridas = Integer.parseInt(JOptionPane.showInputDialog("Número de corridas no mês:"));
                    double custoPorCorrida = Double.parseDouble(JOptionPane.showInputDialog("Custo por corrida:"));
                    veiculo = new Taxi(custoFixoTaxi, corridas, custoPorCorrida);
                    break;

                case "3":
                    int quantidadeBikes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de bicicletas:"));
                    double custoBike = Double
                            .parseDouble(JOptionPane.showInputDialog("Custo mensal de manutenção por bike:"));
                    veiculo = new BicicletaCompartilhada(quantidadeBikes, custoBike);
                    break;

                case "4":
                    double custoFixoTrem = Double.parseDouble(JOptionPane.showInputDialog("Custo fixo do trem:"));
                    double kmRodados = Double.parseDouble(JOptionPane.showInputDialog("Quilômetros rodados no mês:"));
                    double custoPorKm = Double.parseDouble(JOptionPane.showInputDialog("Custo adicional por km:"));
                    veiculo = new TremUrbano(custoFixoTrem, kmRodados, custoPorKm);
                    break;

                case "5":
                    double horasUso = Double.parseDouble(JOptionPane.showInputDialog("Horas de uso no mês:"));
                    double custoHora = Double.parseDouble(JOptionPane.showInputDialog("Custo por hora:"));
                    veiculo = new PatineteEletrico(horasUso, custoHora);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    continue;
            }

            if (veiculo != null) {
                double custo = veiculo.calcularCustoMensal();
                JOptionPane.showMessageDialog(null, "Custo mensal calculado: R$ " + String.format("%.2f", custo));
            }
        }

        JOptionPane.showMessageDialog(null, "Sistema encerrado.");
    }
}
