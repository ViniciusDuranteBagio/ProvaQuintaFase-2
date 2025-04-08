package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @Test
    public void testeOnibus () {
        Onibus onibus = new Onibus("Ônibus escolar amarelo", 1500);
        assertEquals(1500, onibus.calcularCustoMensal());
    }

    @Test
    public void testeTaxi() {
        Taxi taxi = new Taxi("Táxi amarelo", 500, 100, 10);
        assertEquals(1500, taxi.calcularCustoMensal());
    }

    @Test
    public void testeBicicleta() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada("Bicicleta da praça", 10, 15);
        assertEquals(150, bike.calcularCustoMensal());
    }

    @Test
    public void testeTremUrbano() {
        TremUrbano trem = new TremUrbano("Trem central", 2000, 300, 2.5);
        assertEquals(2750, trem.calcularCustoMensal());
    }

    @Test
    public void testePatinete() {
        PatineteEletrico patinete = new PatineteEletrico("Patinete vermelho", 20, 5);
        assertEquals(100, patinete.calcularCustoMensal());
    }

    @Test
    public void testeNegativo() {
        Taxi taxiNegativo = new Taxi("Táxi teste negativo", -500, -10, -20);
        assertEquals(0, taxiNegativo.calcularCustoMensal());

        BicicletaCompartilhada bikeNegativa = new BicicletaCompartilhada("Bike", -5, -30);
        assertEquals(0, bikeNegativa.calcularCustoMensal());

        PatineteEletrico patineteNegativo = new PatineteEletrico("Patinete", -2, -5);
        assertEquals(0, patineteNegativo.calcularCustoMensal());
    }
}
