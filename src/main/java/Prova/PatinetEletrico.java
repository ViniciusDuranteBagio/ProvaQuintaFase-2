package Prova;

public class PatinetEletrico {
    private double horasDeUso;
    private double custoPorHora;

    public PatinetEletrico(String nome, double horasUso, double custoPorHora) {
        if (horasUso < 0) {
            System.out.println("Horas de uso inválidas. Usando 0.");
            horasUso = 0;
        }
        if (custoPorHora < 0) {
            System.out.println("Custo por hora inválido. Usando 0.");
            custoPorHora = 0;
        }

        this.horasDeUso = horasUso;
        this.custoPorHora = custoPorHora;
    }
}
