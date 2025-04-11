package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.application.Main;
import classes.entities.Bicicleta;
import classes.entities.Onibus;
import classes.entities.Patinete;
import classes.entities.Taxi;
import classes.entities.TremUrbano;

public class TestUnit {
    @Test
    void cadastrarOnibusCustoNegativo() {
        Onibus o = new Onibus("Micro", -1000.5 );
        assertEquals(Main.validarValor(o.calcularCusto()), 0);
        
    
    }
    
    @Test
    void cadastrarTaxiCustoNegativo() {
        Taxi t = new Taxi("Ferrari", -1000.5, 10, -60.5 );
        assertEquals(Main.validarValor(t.calcularCusto()), 0);
        
    
    }
    
    @Test
    void cadastrarBicicletaCustoNegativo() {
        Bicicleta b = new Bicicleta("Barra Circular",10, -30.5 );
        assertEquals(Main.validarValor(b.calcularCusto()), 0);        
    
    }
    
    @Test
    void cadastrarTrensCustoNegativo() {
        TremUrbano t = new TremUrbano("Metrô", 30.5, -50, 10);
        assertEquals(Main.validarValor(t.calcularCusto()), 0);        
    
    }
    
    @Test
    void cadastrarPatineteCustoNegativo() {
        Patinete p = new Patinete("Arrascaeta",30.5, -5 );
        assertEquals(Main.validarValor(p.calcularCusto()), 0);        
    
    }

    @Test
    void cadastrarPatineteCustoPositivo() {
        Patinete p = new Patinete("Arrascaeta",30.5, 10 );
        assertEquals(Main.validarValor(p.calcularCusto()), 305);        
    
    }
    
  
    @Test
    void cadastrarOnibusteCustoPositivo() {
    	Onibus o = new Onibus("Micro", 1000.5 );
        assertEquals(Main.validarValor(o.calcularCusto()),1000.5 );        
    
    }
    
    @Test
    void cadastrarTaxiCustoPositivo() {
    	 Taxi t = new Taxi("Ferrari", 100, 10, 60 );
         assertEquals(Main.validarValor(t.calcularCusto()), 700);   
    
    }
    
    @Test
    void cadastrarBicicletaCustoPositivo() {
        Bicicleta b = new Bicicleta("Barra Circular",10, 30 );
        assertEquals(Main.validarValor(b.calcularCusto()), 300);        
    
    }
    
    @Test
    void cadastrarTrensPositivo() {
        TremUrbano t = new TremUrbano("Metrô",50, 30, 10 );
        assertEquals(Main.validarValor(t.calcularCusto()), 350);        
    
    }
}
