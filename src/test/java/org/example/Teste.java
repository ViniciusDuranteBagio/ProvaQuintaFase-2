package org.example;

import classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test
    public void testOnibusCustoMensal() {
        Onibus onibus = new Onibus(5000.0);
        assertEquals(5000.0, onibus.calcularCustoMensal(), 0.01);

        //test valor negativo
        Onibus onibusNegativo = new Onibus(-1000.0);
        assertEquals(0.0, onibusNegativo.calcularCustoMensal(), 0.01);
    }

    @Test
    public void testTaxiCustoMensal() {
        Taxi taxi = new Taxi(2000.0, 100, 15.0);
        assertEquals(3500.0, taxi.calcularCustoMensal(), 0.01);

        //test valores negativos
        Taxi taxiNegativo = new Taxi(-2000.0, -100, -15.0);
        assertEquals(0.0, taxiNegativo.calcularCustoMensal(), 0.01);
    }

    @Test
    public void testBicicletaCustoMensal() {
        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(50, 20.0);
        assertEquals(1000.0, bicicleta.calcularCustoMensal(), 0.01);

        //test valor negativo
        BicicletaCompartilhada bicicletaNegativa = new BicicletaCompartilhada(-50, -20.0);
        assertEquals(0.0, bicicletaNegativa.calcularCustoMensal(), 0.01);
    }

    @Test
    public void testTremCustoMensal() {
        TremUrbano trem = new TremUrbano(10000.0, 500.0, 2.0);
        assertEquals(11000.0, trem.calcularCustoMensal(), 0.01);

        //test valor negativo
        TremUrbano tremNegativo = new TremUrbano(-10000.0, -500.0, -2.0);
        assertEquals(0.0, tremNegativo.calcularCustoMensal(), 0.01);
    }

    @Test
    public void testPatineteCustoMensal() {
        PatineteEletrico patinete = new PatineteEletrico(200.0, 5.0);
        assertEquals(1000.0, patinete.calcularCustoMensal(), 0.01);

        //test valor negativo
        PatineteEletrico patineteNegativo = new PatineteEletrico(-200.0, -5.0);
        assertEquals(0.0, patineteNegativo.calcularCustoMensal(), 0.01);
    }
}