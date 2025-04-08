package classes;

// Cristian Bianco, Gustavo Bianco
import javax.swing.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu" +
                    "\n1 - Cadastrar Ônibus" +
                    "\n2 - Cadastrar Táxi" +
                    "\n3 - Cadastrar Bicicleta" +
                    "\n4 - Cadastrar Trem" +
                    "\n5 - Cadastrar Patinete" +
                    "\n0 - Sair"));

            switch (op){
                case 1:{
                    double custo_fixo = Double.parseDouble(input("Custo fixo mensal: "));
                    Onibus onibus = new Onibus(custo_fixo);
                    msg(onibus.mostrarStatus());
                    break;
                }

                case 2:{
                    double custo_fixo = Double.parseDouble(input("Custo fixo: "));
                    double custo_Corrida = Double.parseDouble(input("Custo por corrida: "));
                    int num_corridas = Integer.parseInt(input("Numero de Corridas: "));
                    Taxi taxi = new Taxi(custo_fixo, num_corridas, custo_Corrida);
                    msg(taxi.mostrarStatus());
                    break;
                }
                case 3:{
                    int quantidade = Integer.parseInt(input("Quantidade: "));
                    double custo_manutencao = Double.parseDouble(input("Custo manutenção: "));
                    Bicicleta bicicleta = new Bicicleta(quantidade, custo_manutencao);
                    msg(bicicleta.mostrarStatus());
                    break;
                }
                case 4:{
                    double custo_fixo = Double.parseDouble(input("Custo fixo: "));
                    int quantidade_km = Integer.parseInt(input("Quantidade de Km: "));
                    double custo_km = Double.parseDouble(input("Custo por Km: "));
                    Trem trem = new Trem(custo_fixo, quantidade_km, custo_km);
                    msg(trem.mostrarStatus());
                    break;
                }
                case 5:{
                    int horas = Integer.parseInt(input("Horas mensais: "));
                    double custo_hora = Double.parseDouble(input("Custo por hora: "));
                    Patinete patinete = new Patinete(horas, custo_hora);
                    msg(patinete.mostrarStatus());
                    break;
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Finalizado com sucesso!");
                }
            }
        }
        while (op != 0);
    }
    public static String input(String txt){
        return JOptionPane.showInputDialog(null, txt);
    }
    public static void msg(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }

}
