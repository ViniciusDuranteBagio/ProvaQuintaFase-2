package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @Test
    void testOnibusCusto() {
        Onibus onibus = new Onibus();
        onibus.setCustoFixo(5000);
        assertEquals(5000, onibus.calcularCusto());
    }

    @Test
    void testTaxiCusto() {
        Taxi taxi = new Taxi();
        taxi.setCustoFixo(1000);
        taxi.setQntCorridas(10);
        taxi.setCustoCorrida(15);
        assertEquals(1000 + 10 * 15, taxi.calcularCusto());
    }

    @Test
    void testBicicletaCompartilhadaCusto() {
        BicicletaCompartilhada bike = new BicicletaCompartilhada();
        bike.setQntBicicletas(20);
        bike.setCustoFixo(30); // manutenção por bicicleta
        assertEquals(20 * 30, bike.calcularCusto());
    }

    @Test
    void testTremUrbanoCusto() {
        TremUrbano trem = new TremUrbano();
        trem.setCustoFixo(2000);
        trem.setQuilometrosMes(300);
        trem.setValorKm(10);
        assertEquals(300 * 10 + 2000, trem.calcularCusto());
    }

    @Test
    void testPatineteEletricoCusto() {
        PatineteEletrico patinete = new PatineteEletrico();
        patinete.setHorasUso(50);
        patinete.setCustoFixo(5); // custo por hora
        assertEquals(50 * 5, patinete.calcularCusto());
    }

    @Test
    void testNomeVeiculo() {
        Onibus onibus = new Onibus();
        onibus.setNome("Circular");
        assertEquals("Circular", onibus.getNome());
    }

    @Test
    void testValorNegativoOnibus() {
        Onibus onibus = new Onibus();
        onibus.setCustoFixo(-1000);
        assertEquals(0, onibus.getCustoFixo());
        assertEquals(0, onibus.calcularCusto());
    }

    @Test
    void testValorNegativoTaxi() {
        Taxi taxi = new Taxi();
        taxi.setCustoFixo(-500);
        taxi.setCustoCorrida(-10);
        taxi.setQntCorridas(-5);
        assertEquals(0, taxi.getCustoFixo());
        assertEquals(0, taxi.getCustoCorrida());
        assertEquals(0, taxi.getQntCorridas());
        assertEquals(0, taxi.calcularCusto());
    }

    @Test
    void testValorNegativoBicicleta() {
        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada();
        bicicleta.setCustoFixo(-20);
        bicicleta.setQntBicicletas(-3);
        assertEquals(0, bicicleta.getCustoFixo());
        assertEquals(0, bicicleta.getQntBicicletas());
        assertEquals(0, bicicleta.calcularCusto());
    }

    @Test
    void testValorNegativoTremUrbano() {
        TremUrbano trem = new TremUrbano();
        trem.setCustoFixo(-1000);
        trem.setQuilometrosMes(-100);
        trem.setValorKm(-5);
        assertEquals(0, trem.getCustoFixo());
        assertEquals(0, trem.getQuilometrosMes());
        assertEquals(0, trem.getValorKm());
        assertEquals(0, trem.calcularCusto());
    }

    @Test
    void testValorNegativoPatinete() {
        PatineteEletrico patinete = new PatineteEletrico();
        patinete.setCustoFixo(-10);
        patinete.setHorasUso(-5);
        assertEquals(0, patinete.getCustoFixo());
        assertEquals(0, patinete.getHorasUso());
        assertEquals(0, patinete.calcularCusto());
    }
}
