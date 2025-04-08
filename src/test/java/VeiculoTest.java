package test.java;

import main.java.classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testOnibus() {
        Onibus onibus = new Onibus("Modelo A", 1000);
        assertEquals("Modelo A", onibus.getModelo());
        assertEquals(1000, onibus.getCustoFixoMensal());
        assertEquals(1000, onibus.calcularCusto());
    }

    @Test
    void testTaxi() {
        Taxi taxi = new Taxi("Modelo B", 500, 10, 20);
        assertEquals("Modelo B", taxi.getModelo());
        assertEquals(500, taxi.getCustoFixo(), 0.01);
        assertEquals(10, taxi.getNumeroCorridas());
        assertEquals(20, taxi.getCustoCadaCorrida(), 0.01);
        assertEquals(700, taxi.calcularCusto(), 0.01);
    }

    @Test
    void testBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Modelo C", 5, 50);
        assertEquals("Modelo C", bicicleta.getModelo());
        assertEquals(5, bicicleta.getQtdDeBicicletas());
        assertEquals(50, bicicleta.getCustoManutencaoUnidade(), 0.01);
        assertEquals(250, bicicleta.calcularCusto(), 0.01);
    }

    @Test
    void testTrem() {
        Trem trem = new Trem("Modelo D", 2000, 100, 2);
        assertEquals("Modelo D", trem.getModelo());
        assertEquals(2000, trem.getCustoFixoMensal(), 0.01);
        assertEquals(100, trem.getQtdKmRodados(), 0.01);
        assertEquals(2, trem.getAdiocionalQuilometro(), 0.01);
        assertEquals(2200, trem.calcularCusto(), 0.01);
    }

    @Test
    void testPatinete(){
        Patinete patinete = new Patinete("Modelo E", 300, 10);
        assertEquals("Modelo E", patinete.getModelo());
        assertEquals(3000, patinete.calcularCusto());
    }

    @Test
    void testValidarEntrada() {
        Veiculo veiculo = new Veiculo("Modelo E");
        assertEquals(0, veiculo.validarEntrada(-10), 0.01);
        assertEquals(5, veiculo.validarEntrada(5), 0.01);
    }

}
