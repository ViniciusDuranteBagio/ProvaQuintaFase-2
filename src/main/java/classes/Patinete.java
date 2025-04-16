package classes;

public class Patinete extends Veiculo{

    private int qntdHoraPatinete;
    private double custoHora;

    public Patinete(int quantidade_Hora, double custo_Hora) {
        qntdHoraPatinete = validarValor(quantidade_Hora);
        custoHora = validarValor(custo_Hora);
        custoTotal = qntdHoraPatinete * custoHora;
    }
    public Patinete(){}

    @Override
    public String mostrarStatus() {
        return "Horas mensais: "+qntdHoraPatinete+"\nCusto por hora: R$"+custoHora+ "\nCusto total: R$" + custoTotal;
    }
}