package classes;

import javax.swing.*;
import java.util.ArrayList;

import static classes.Validacoes.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int op = 0;
        while (op != 7) {
            op = Integer.parseInt(JOptionPane.showInputDialog(("""
                    1 - Cadastrar Onibus
                    2 - Cadastrar Taxi
                    3 - Cadastrar Bicicleta Compartilhada
                    4 - Cadastrar Trem Urbano
                    5 - Cadastrar Patinete Elétrico
                    6 - Listar Veículos
                    7 - Sair
                    """)));

            switch (op) {

                case 1:
                    Onibus onibus = new Onibus();
                    onibus.setNome(receberNome());
                    onibus.setCustoFixo(receberCustoFixoOnibus());
                    veiculos.add(onibus);
                    break;

                case 2:
                    Taxi taxi = new Taxi();
                    taxi.setNome(receberNome());
                    taxi.setCustoFixo(receberCustoFixoTaxi());
                    taxi.setCustoFixo(receberCustoPorCorridaTaxi());
                    taxi.setQntCorridas(receberNumeroCorridasTaxi());
                    veiculos.add(taxi);
                    break;

                case 3:
                    BicicletaCompartilhada bicicleta = new BicicletaCompartilhada();
                    bicicleta.setNome(receberNome());
                    bicicleta.setQntBicicletas(receberQuantidadeBicicletas());
                    bicicleta.setCustoFixo(receberCustoFixoBicicleta());
                    veiculos.add(bicicleta);
                    break;

                case 4:
                    TremUrbano tremUrbano = new TremUrbano();
                    tremUrbano.setNome(receberNome());
                    tremUrbano.setCustoFixo(receberCustoFixoTrem());
                    tremUrbano.setQuilometrosMes(receberQuilometrosTrem());
                    tremUrbano.setValorKm(receberCustoPorKmTrem());
                    veiculos.add(tremUrbano);
                    break;

                case 5:
                    PatineteEletrico patineteEletrico = new PatineteEletrico();
                    patineteEletrico.setNome(receberNome());
                    patineteEletrico.setCustoFixo(receberCustoFixoPatinete());
                    patineteEletrico.setHorasUso(receberHorasUsoPatinete());
                    veiculos.add(patineteEletrico);
                    break;

                case 6:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Lista de Veículos: \n");
                    for (Veiculo veiculo : veiculos) {
                        sb.append(veiculo.exibirInfo()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb);
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        }
    }
}

