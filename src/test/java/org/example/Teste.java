package org.example;

import classes.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
        @Test
        public void testOnibusCustoNormal() {
            Onibus onibus = new Onibus(1000.0);
            assertEquals(1000.0, onibus.calcularCustoMensal(), 0.001);
        }

    @Test
    public void testOnibusCustoNegativo() {
        Onibus onibus = new Onibus(-100.0);
        assertEquals(0.0, onibus.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testTaxiCustoNormal() {
        Taxi taxi = new Taxi(500.0, 20, 10.0);
        assertEquals(700.0, taxi.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testTaxiValoresNegativos() {
        Taxi taxi = new Taxi(-500.0, -20, -10.0);
        assertEquals(0.0, taxi.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testBicicletaCustoNormal() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada(10, 50.0);
        assertEquals(500.0, bike.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testBicicletaValoresNegativos() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada(-10, -50.0);
        assertEquals(0.0, bike.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testTremCustoNormal() {
        TremUrbano trem = new TremUrbano(1000.0, 500.0, 2.0);
        assertEquals(2000.0, trem.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testTremValoresNegativos() {
        TremUrbano trem = new TremUrbano(-1000.0, -500.0, -2.0);
        assertEquals(0.0, trem.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testPatineteCustoNormal() {
        PatineteEletrico patinete = new PatineteEletrico(100.0, 5.0);
        assertEquals(500.0, patinete.calcularCustoMensal(), 0.001);
    }

    @Test
    public void testPatineteValoresNegativos() {
        PatineteEletrico patinete = new PatineteEletrico(-100.0, -5.0);
        assertEquals(0.0, patinete.calcularCustoMensal(), 0.001);
    }
}

