package org.example;
import classes.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test {
    // todo fazer os testes de cenario aqui nesse arquivo
    @org.junit.jupiter.api.Test
    void onibusTest1(){
        //Initialize
        Onibus onibus = new Onibus();
        onibus.setCusto(1000);
        assertEquals(1000, onibus.getCusto());
    }
    @org.junit.jupiter.api.Test
    void onibusTest2() {
        //Initialize
        Onibus onibus = new Onibus();
        onibus.setCusto(-1000);
        assertEquals(0, onibus.getCusto());
    }

    @org.junit.jupiter.api.Test
    void taxiTest1(){
        //Initialize
        Taxi taxi = new Taxi();
        taxi.setCusto(1000);
        taxi.setQtCorrida(10);
        taxi.setVlCorrida(100);
        //Asserts
        assertEquals(1000, taxi.getCusto());
        assertEquals(10, taxi.getQtCorrida());
        assertEquals(100, taxi.getVlCorrida());
        assertEquals(2000, taxi.vCusto());
    }
    @org.junit.jupiter.api.Test
    void taxiTest2(){
        //Initialize
        Taxi taxi = new Taxi();
        taxi.setCusto(-1000);
        taxi.setQtCorrida(-10);
        taxi.setVlCorrida(-100);
        //Asserts
        assertEquals(0, taxi.getCusto());
        assertEquals(0, taxi.getQtCorrida());
        assertEquals(0, taxi.getVlCorrida());
        assertEquals(0, taxi.vCusto());
    }

    @org.junit.jupiter.api.Test
    void bicicletaTest1(){
        //Initialize
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setCusto(250);
        bicicleta.setQtBicicletas(10);
        //Asserts
        assertEquals(250, bicicleta.getCusto());
        assertEquals(10, bicicleta.getQtBicicletas());
        assertEquals(2500, bicicleta.vCusto());
    }
    @org.junit.jupiter.api.Test
    void bicicletaTest2(){
        //Initialize
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setCusto(-250);
        bicicleta.setQtBicicletas(-4);
        //Asserts
        assertEquals(0, bicicleta.getCusto());
        assertEquals(0, bicicleta.getQtBicicletas());
        assertEquals(0, bicicleta.vCusto());
    }

    @org.junit.jupiter.api.Test
    void tremTest1(){
        //Initialize
        Trem trem = new Trem();
        trem.setCusto(100000);
        trem.setQtKm(1000);
        trem.setVlKm(100);
        //Asserts
        assertEquals(100000, trem.getCusto());
        assertEquals(1000, trem.getQtKm());
        assertEquals(100, trem.getVlKm());
        assertEquals(200000, trem.vCusto());
    }
    @org.junit.jupiter.api.Test
    void tremTest2(){
        //Initialize
        Trem trem = new Trem();
        trem.setCusto(-100000);
        trem.setQtKm(-1000);
        trem.setVlKm(-100);
        //Asserts
        assertEquals(0, trem.getCusto());
        assertEquals(0, trem.getQtKm());
        assertEquals(0, trem.getVlKm());
        assertEquals(0, trem.vCusto());
    }

    @org.junit.jupiter.api.Test
    void patineteTest1(){
        //Initialize
        Patinete patinete = new Patinete();
        patinete.setCusto(25);
        patinete.setQtHoras(2);
        //Asserts
        assertEquals(25, patinete.getCusto());
        assertEquals(2, patinete.getQtHoras());
        assertEquals(50, patinete.vCusto());
    }
    @org.junit.jupiter.api.Test
    void patineteTest2(){
        //Initialize
        Patinete patinete = new Patinete();
        patinete.setCusto(-25);
        patinete.setQtHoras(-2);
        //Asserts
        assertEquals(0, patinete.getCusto());
        assertEquals(0, patinete.getQtHoras());
        assertEquals(0, patinete.vCusto());
    }
}
