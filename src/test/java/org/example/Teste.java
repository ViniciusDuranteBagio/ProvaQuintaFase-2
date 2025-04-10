package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {

    @Test
    public void testeOnibus() {
        Onibus onibus = new Onibus(3000);
        assertEquals(3000.0, onibus.calcularCustoMensal());
    }

    @Test
    public void testeOnibusComValorNegativo() {
        Onibus onibus = new Onibus(-5000);
        assertEquals(0.0, onibus.calcularCustoMensal());
    }

    @Test
    public void testeTaxi() {
        Taxi taxi = new Taxi(1000, 10, 20);
        assertEquals(1200.0, taxi.calcularCustoMensal());
    }

    @Test
    public void testeTaxiComValoresInvalidos() {
        Taxi taxi = new Taxi(-1000, -5, -30);
        assertEquals(0.0, taxi.calcularCustoMensal());
    }

    @Test
    public void testeBicicleta() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada(10, 50);
        assertEquals(500.0, bike.calcularCustoMensal());
    }

    @Test
    public void testeBicicletaComValoresInvalidos() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada(-3, -80);
        assertEquals(0.0, bike.calcularCustoMensal());
    }

    @Test
    public void testeTrem() {
        TremUrbano trem = new TremUrbano(2000, 100, 5);
        assertEquals(2500.0, trem.calcularCustoMensal());
    }

    @Test
    public void testeTremComValoresInvalidos() {
        TremUrbano trem = new TremUrbano(-1000, -200, -10);
        assertEquals(0.0, trem.calcularCustoMensal());
    }

    @Test
    public void testePatinete() {
        PatineteEletrico patinete = new PatineteEletrico(30, 10);
        assertEquals(300.0, patinete.calcularCustoMensal());
    }

    @Test
    public void testePatineteComValoresInvalidos() {
        PatineteEletrico patinete = new PatineteEletrico(-20, -15);
        assertEquals(0.0, patinete.calcularCustoMensal());
    }
}
