package test.java.org.example;

import main.java.classes.Bicicleta;
import main.java.classes.Onibus;
import main.java.classes.Taxi;
import main.java.classes.Trem;

import static org.junit.Assert.assertEquals;

public class Teste {
    @org.junit.jupiter.api.Test
    public void Teste() {
        // Teste de criação de ônibus
        Onibus onibus = new Onibus("Modelo A", 1000);
        assertEquals("Modelo A", onibus.getModelo());
        assertEquals(1000, onibus.getCustoFixoMensal(), 0.01);
        assertEquals(1000, onibus.calcularCusto(), 0.01);

        // Teste de criação de táxi
        Taxi taxi = new Taxi("Modelo B", 500, 10, 20);
        assertEquals("Modelo B", taxi.getModelo());
        assertEquals(500, taxi.getCustoFixo(), 0.01);
        assertEquals(10, taxi.getNumeroCorridas());
        assertEquals(20, taxi.getCustoCadaCorrida(), 0.01);
        assertEquals(700, taxi.calcularCusto(), 0.01);

        // Teste de criação de bicicleta
        Bicicleta bicicleta = new Bicicleta("Modelo C", 5, 50);
        assertEquals("Modelo C", bicicleta.getModelo());
        assertEquals(5, bicicleta.getQtdDeBicicletas());
        assertEquals(50, bicicleta.getCustoManutencaoUnidade(), 0.01);
        assertEquals(250, bicicleta.calcularCusto(), 0.01);

        // Teste de criação de trem
        Trem trem = new Trem("Modelo D", 2000, 100, 2);
        assertEquals("Modelo D", trem.getModelo());
        assertEquals(2000, trem.getCustoFixoMensal(), 0.01);
        assertEquals(100, trem.getQtdKmRodados(), 0.01);
        assertEquals(2, trem.getAdiocionalQuilometro(), 0.01);
        assertEquals(2200, trem.calcularCusto(), 0.01);
    }
}
