package br.com.brejas.service;

import br.com.brejas.veiculos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCriacaoBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Bicicleta", 100.0, 2, 30);
        Veiculo veiculo = new Veiculo("Bicicleta", bicicleta.getCusto());

        assertEquals("Bicicleta", veiculo.getNome());
        assertEquals(bicicleta.getCusto(), veiculo.getCusto());
    }

    @Test
    public void testCriacaoOnibus() {
        Onibus onibus = new Onibus("Ônibus", 500.0);
        Veiculo veiculo = new Veiculo("Ônibus", onibus.getCusto());

        assertEquals("Ônibus", veiculo.getNome());
        assertEquals(onibus.getCusto(), veiculo.getCusto());
    }

    @Test
    public void testCriacaoPatinete() {
        Patinete patinete = new Patinete("Patinete", 10.0, 5.0);
        Veiculo veiculo = new Veiculo("Patinete", patinete.getCusto());

        assertEquals("Patinete", veiculo.getNome());
        assertEquals(patinete.getCusto(), veiculo.getCusto());
    }

    @Test
    public void testCriacaoTaxi() {
        Taxi taxi = new Taxi("Táxi", 80.0, 10);
        Veiculo veiculo = new Veiculo("Táxi", taxi.getCusto());

        assertEquals("Táxi", veiculo.getNome());
        assertEquals(taxi.getCusto(), veiculo.getCusto());
    }

    @Test
    public void testCriacaoTrem() {
        Trem trem = new Trem("Trem", 100.0, 120.0, 0.75);
        Veiculo veiculo = new Veiculo("Trem", trem.getCusto());

        assertEquals("Trem", veiculo.getNome());
        assertEquals(trem.getCusto(), veiculo.getCusto());
    }

}