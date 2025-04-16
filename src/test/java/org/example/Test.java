package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testePrograma {

    @Test
    public void test() {
        // todo fazer os testes de cenario aqui nesse arquivo
        // Entrada validas
        Onibus onibus = new Onibus(2000);
        assertEquals(onibus.getCustoTotal(), 2000);

        Taxi taxi = new Taxi(1000, 30, 20);
        assertEquals(taxi.getCustoTotal(), 1600);

        Bicicleta bicicleta = new Bicicleta(15, 30);
        assertEquals(bicicleta.getCustoTotal(), 450);

        Trem trem = new Trem(1000,800, 10);
        assertEquals(trem.getCustoTotal(), 9000);

        Patinete patinete = new Patinete(25, 20);
        assertEquals(patinete.getCustoTotal(), 500);

        Onibus onibus2 = new Onibus(-1);
        assertEquals(onibus2.getCustoTotal(), 0);

        Taxi taxi2 = new Taxi(-20000, -3000, -651);
        assertEquals(taxi2.getCustoTotal(), 0);

        Bicicleta bicicleta2 = new Bicicleta(-752, -652);
        assertEquals(bicicleta2.getCustoTotal(), 0);

        Trem trem2 = new Trem(-9765,-1235, -965);
        assertEquals(trem2.getCustoTotal(), 0);

        Patinete patinete2 = new Patinete(-6523, -468);
        assertEquals(patinete2.getCustoTotal(), 0);
    }
}