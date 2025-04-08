package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Teste {
    @Test
    public void teste() {
        // todo fazer os testes de cenario aqui nesse arquivo
        // Entrada validas
        Onibus onibus = new Onibus(1000);
        assertEquals(onibus.getM_custo_total(), 1000);

        Taxi taxi = new Taxi(1000, 50, 10);
        assertEquals(taxi.getM_custo_total(), 1500);

        Bicicleta bicicleta = new Bicicleta(10, 50);
        assertEquals(bicicleta.getM_custo_total(), 500);

        Trem trem = new Trem(1000,100, 50);
        assertEquals(trem.getM_custo_total(), 6000);

        Patinete patinete = new Patinete(10, 50);
        assertEquals(patinete.getM_custo_total(), 500);

        // Entradas invalidas

        Onibus onibus2 = new Onibus(-1);
        assertEquals(onibus2.getM_custo_total(), 0);

        Taxi taxi2 = new Taxi(-1000, -50, -10);
        assertEquals(taxi2.getM_custo_total(), 0);

        Bicicleta bicicleta2 = new Bicicleta(-10, -50);
        assertEquals(bicicleta2.getM_custo_total(), 0);

        Trem trem2 = new Trem(-1000,-100, -50);
        assertEquals(trem2.getM_custo_total(), 0);

        Patinete patinete2 = new Patinete(-10, -50);
        assertEquals(patinete2.getM_custo_total(), 0);
    }
}
