package classes;

import java.util.Scanner;

//Equipe: Lucca & Leticia
public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        Menu();
    }
    //Methods
    public static void Menu() {
        int opcao;
        do {
            System.out.println("""
                    Menu
                    !Cadastrar!
                    Onibus (1)
                    Taxi (2)
                    Bicicleta (3)
                    Trem (4)
                    Patinete (5)
                    Sair (6)""");
            opcao = Escolha();
            switch (opcao) {
                case 1:
                    Onibus onibus = new Onibus();
                    onibus.cadastrar();
                    System.out.println(onibus);
                    break;

                case 2:
                    Taxi taxi = new Taxi();
                    taxi.cadastrar();
                    System.out.println(taxi);
                    break;

                case 3:
                    Bicicleta bicicleta = new Bicicleta();
                    bicicleta.cadastrar();
                    System.out.println(bicicleta);
                    break;

                case 4:
                    Trem trem = new Trem();
                    trem.cadastrar();
                    System.out.println(trem);
                    break;

                case 5:
                    Patinete patinete = new Patinete();
                    patinete.cadastrar();
                    System.out.println(patinete);
                    break;
            }
        } while (opcao != 6);
    }

    public static int Escolha() {
        Scanner scanner = new Scanner(System.in);
        int opcao = Integer.parseInt((scanner.nextLine()));
        if (opcao > 0 && opcao <= 6) {
            return opcao;
        } else {
            return 6;
        }
    }
}
