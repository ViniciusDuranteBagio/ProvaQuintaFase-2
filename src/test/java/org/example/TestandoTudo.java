package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestandoTudo {


        @Test
        void validarValorPositivo() {
            assertEquals(100.0, VeiculoPublico.validarValor(100.0));
        }

        @Test
        void validarValorNegativo() {
            assertEquals(0.0, VeiculoPublico.validarValor(-50.0));
        }

        @Test
        void calcularGastoMensalVeiculoPublico() {
            VeiculoPublico veiculo = new VeiculoPublico(500.0);
            assertEquals(500.0, veiculo.calcularGastoMensal());
        }

        @Test
        void calcularGastoMensalOnibus() {
            Onibus onibus = new Onibus(300.0);
            assertEquals(300.0, onibus.calcularGastoMensal());
        }

        @Test
        void calcularGastoMensalBicicleta() {
            Bicicleta bicicleta = new Bicicleta(50.0, 10, 15.0);
            assertEquals(200.0, bicicleta.calcularGastoMensal());
        }

        @Test
        void calcularGastoMensalPatinsEletrico() {
            PatinsEletrico patinete = new PatinsEletrico(20.0, 5.0, 10);
            assertEquals(70.0, patinete.calcularGastoMensal());
        }

        @Test
        void calcularGastoMensalTaxi() {
            Taxi taxi = new Taxi(100.0, 10.0, 20);
            assertEquals(300.0, taxi.calcularGastoMensal());
        }

        @Test
        void calcularGastoMensalTremUrbano() {
            TremUrbano trem = new TremUrbano(500.0, 2.5, 100);
            assertEquals(750.0, trem.calcularGastoMensal());
        }

        @Test
        void atributosBicicleta() {
            Bicicleta bicicleta = new Bicicleta(30.0, 5, 10.0);
            assertEquals(5, bicicleta.getQtdBicicleta());
            assertEquals(10.0, bicicleta.getCustoMensalManutencao());
        }

        @Test
        void atributosPatinsEletrico() {
            PatinsEletrico patinete = new PatinsEletrico(15.0, 7.0, 3);
            assertEquals(7.0, patinete.getCustoFixoHoras());
            assertEquals(3, patinete.getHorasConsumidas());
        }

        @Test
        void atributosTaxi() {
            Taxi taxi = new Taxi(200.0, 12.0, 25);
            assertEquals(12.0, taxi.getValorCorrida());
            assertEquals(25, taxi.getNumeroCorridas());
        }

        @Test
        void atributosTremUrbano() {
            TremUrbano trem = new TremUrbano(400.0, 3.0, 150);
            assertEquals(3.0, trem.getKmRodados() / 50, 0.01); // Exemplo de cálculo
        }
    }


