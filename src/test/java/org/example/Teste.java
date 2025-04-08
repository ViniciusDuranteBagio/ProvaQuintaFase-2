package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import classes.Bicicleta;
import classes.Onibus;
import classes.Patinete;
import classes.Taxi;
import classes.Trem;

public class Teste {
    @org.junit.jupiter.api.Test
    public void TodosTestes() {

        Onibus onibus = new Onibus(500.0);
        assertEquals(500.0, onibus.calculaValorMensal());

        Taxi taxi = new Taxi(100.0, 10, 8.0);
        assertEquals(180.0, taxi.calculaValorMensal());

        Bicicleta bicicleta = new Bicicleta(5, 15.0);
        assertEquals(75.0, bicicleta.calculaValorMensal());

        Trem trem = new Trem(300.0, 50.0, 2.0);
        assertEquals(400.0, trem.calculaValorMensal());

        Patinete patinete = new Patinete(12.0, 2.5);
        assertEquals(30.0, patinete.calculaValorMensal());
    }
}
