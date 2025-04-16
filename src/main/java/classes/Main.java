package classes;

// Cristian Bianco, Gustavo Bianco
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("|------------ MENU ------------|" +
                    "\n1 - Cadastrar Ônibus" +
                    "\n2 - Cadastrar Táxi" +
                    "\n3 - Cadastrar Bicicleta" +
                    "\n4 - Cadastrar Trem" +
                    "\n5 - Cadastrar Patinete" +
                    "\n0 - Sair" +
                    "\n|----------------------------------|"));

            switch (op){
                case 1:{
                    double custoFixo = Double.parseDouble(input("Custo Fixo Mensal:"));
                    Onibus onibus = new Onibus(custoFixo);
                    msg(onibus.mostrarStatus());
                    break;
                }

                case 2:{
                    double custoFixo = Double.parseDouble(input("Custo Fixo:"));
                    int nmrCorridas = Integer.parseInt(input("Numero de Corridas: "));
                    double custoCorrida = Double.parseDouble(input("Custo por Corrida:"));
                    Taxi taxi = new Taxi(custoFixo, nmrCorridas, custoCorrida);
                    msg(taxi.mostrarStatus());
                    break;
                }
                case 3:{
                    int qntdBike = Integer.parseInt(input("Quantidade Bicicleta: "));
                    double custoManutencao = Double.parseDouble(input("Custo Manutenção:"));
                    Bicicleta bicicleta = new Bicicleta(qntdBike, custoManutencao);
                    msg(bicicleta.mostrarStatus());
                    break;
                }
                case 4:{
                    double custoFixo = Double.parseDouble(input("Custo Fixo:"));
                    int qntdKilometro = Integer.parseInt(input("Quantidade de Km: "));
                    double custoKilometro = Double.parseDouble(input("Custo por Km:"));
                    Trem trem = new Trem(custoFixo, qntdKilometro, custoKilometro);
                    msg(trem.mostrarStatus());
                    break;
                }
                case 5:{
                    int qntdHoras = Integer.parseInt(input("Horas Mensais: "));
                    double custoHora = Double.parseDouble(input("Custo por Hora:"));
                    Patinete patinete = new Patinete(qntdHoras, custoHora);
                    msg(patinete.mostrarStatus());
                    break;
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Finalizado com Sucesso!");
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