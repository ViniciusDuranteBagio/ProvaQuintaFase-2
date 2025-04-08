package br.com.brejas.service;

import br.com.brejas.veiculos.Veiculo;

import javax.swing.*;

public class Menu {

    public int inicio(){
        int valor;
        boolean valorValido = false;

        do {
            valor = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Escolha um número \n" +
                                    "1 - Criar um novo veículo ativo \n" +
                                    "2 - Fechar \n"
                    ));

            if (valor == 1 || valor == 2) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: \n O valor selecionado não pode ser " + valor + "!\nPor favor, tente novamente com um valor permitido (1 ou 2).",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;

    }

    public String veiculos(){
        boolean valorValido = false;
        String resposta;
        String[] veiculo = {"Bicicleta", "Ônibus", "Patinete", "Táxi", "Trem"};

        do {
            resposta = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha um veículo:",
                    "Veículos",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    veiculo,
                    veiculo[0]
            );
            if (resposta != null) {
                valorValido = true;
            }else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: É obrigatório o cadastro de um veículo!\nPor favor, tente novamente.",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return resposta;
    }

    public double valorDouble(String motivo){
        double valor;
        boolean valorValido = false;

        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + motivo));

            if (valor >= 0) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: O " + motivo + " não pode ser negativo!\nPor favor, tente novamente com um valor positivo.",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;
    }
    public int valorInt(String motivo){
        int valor;
        boolean valorValido = false;

        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite" + motivo));

            if (valor >= 0) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: O " + motivo + " não pode ser negativo!\nPor favor, tente novamente com um valor positivo.",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;
    }

    public String valorString(String motivo){
        String valor;
        boolean valorValido = false;

        do {
            valor = JOptionPane.showInputDialog(null, "Digite o " + motivo);

            if (valor != null && valor.matches("[a-zA-Z ]+")) {
                valorValido = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "ERRO: O " + valor + " não é permitido!\nPor favor, tente novamente usando somente letras.",
                        "Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!valorValido);

        return valor;
    }

    public void visualizar(Veiculo veiculo){
        JOptionPane.showMessageDialog(null,
                "Descrição: " + veiculo.getNome() + "\n" +
                        "Custo mensal: " + veiculo.getCusto()
        );
    }
}
