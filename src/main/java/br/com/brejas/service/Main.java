package br.com.brejas.service;

import br.com.brejas.veiculos.*;

public class
Main {
    // alunos: Carlos Souza, Matheus Lessa, Ryan Speck
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean ativo = true;
        int op;

        do {
            op = menu.inicio();

            if (op == 1) {
                double custo = 0;
                String descricao = menu.veiculos();

                if (!descricao.equalsIgnoreCase("Patinete")){
                    custo = menu.valorDouble("custo mensal: ");
                }

                switch (descricao) {
                    case "Bicicleta":
                        int qtdBicicleta = menu.valorInt("a quantidade de bibicletas: ");
                        int ctManutencao = menu.valorInt("o valor médio da manutenção por bibicleta: ");

                        Bicicleta bc = new Bicicleta(descricao, custo, qtdBicicleta, ctManutencao);
                        Veiculo vcBicicleta = new Veiculo(descricao, bc.getCusto());
                        menu.visualizar(vcBicicleta);
                        break;

                    case "Ônibus":

                        Onibus ob = new Onibus(descricao, custo);
                        Veiculo vcOnibus = new Veiculo(descricao, ob.getCusto());
                        menu.visualizar(vcOnibus);
                        break;

                    case "Patinete":
                        double horasUso = menu.valorDouble("quantidade de horas utilizadas: ");
                        double custoHoras = menu.valorDouble("valor da hora");

                        Patinete ptn = new Patinete(descricao, horasUso, custoHoras);
                        Veiculo vcPatinete = new Veiculo(descricao, ptn.getCusto());
                        menu.visualizar(vcPatinete);
                        break;

                    case "Táxi":
                        int numCorrida = menu.valorInt(" a quantidade de corridas: ");

                        Taxi sg = new Taxi(descricao, custo, numCorrida);
                        Veiculo vcTaxi = new Veiculo(descricao, sg.getCusto());
                        menu.visualizar(vcTaxi);
                        break;

                    case "Trem":
                        double km = menu.valorDouble("Digite a distância (KM): ");
                        double valorKm = menu.valorDouble("o valor da quilometragem:");

                        Trem tr = new Trem(descricao, custo, km, valorKm);
                        Veiculo vcTrem = new Veiculo(descricao, tr.getCusto());
                        menu.visualizar(vcTrem);
                        break;
                }

            } else {
                ativo = false;
            }
        } while (ativo);
    }
}
