package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;


public class Teste {
    @Test
    public void testOnibusComCustoValido() {
        BigDecimal custo = new BigDecimal("500.00");
        Onibus onibus = new Onibus(custo);
        assertEquals(custo, onibus.calculaCustoMensal(), "O custo mensal do ônibus está incorreto");
    }

    @Test
    public void testOnibusComCustoNegativo() {
        BigDecimal custo = new BigDecimal("-100.00");
        Onibus onibus = new Onibus(custo);
        assertEquals(BigDecimal.ZERO, onibus.calculaCustoMensal(), "O custo mensal do ônibus com custo negativo deve ser zero");
    }

    @Test
    public void testPatineteEletricoComCustoValido() {
        BigDecimal custo = new BigDecimal("50.00");
        int horasDeUso = 100;
        PatineteEletrico patinete = new PatineteEletrico(custo, horasDeUso);
        BigDecimal custoEsperado = custo.multiply(BigDecimal.valueOf(horasDeUso));
        assertEquals(custoEsperado, patinete.calculaCustoMensal(), "O custo mensal do patinete elétrico está incorreto");
    }

    @Test
    public void testPatineteEletricoComCustoNegativo() {
        BigDecimal custo = new BigDecimal("-50.00");
        int horasDeUso = 100;
        PatineteEletrico patinete = new PatineteEletrico(custo, horasDeUso);

        assertEquals(BigDecimal.ZERO, patinete.calculaCustoMensal(),
                "O custo mensal do patinete com custo negativo deve ser corrigido para zero");
    }


    @Test
    public void testTaxiComCustoValido() {
        BigDecimal custoFixo = new BigDecimal("300.00");
        BigDecimal custoVariavel = new BigDecimal("2.50");
        int numCorridas = 200;
        Taxi taxi = new Taxi(custoFixo, custoVariavel, numCorridas);
        BigDecimal custoEsperado = custoFixo.add(custoVariavel.multiply(BigDecimal.valueOf(numCorridas)));
        assertEquals(custoEsperado, taxi.calculaCustoMensal(), "O custo mensal do táxi está incorreto");
    }

    @Test
    public void testTaxiComCustoVariavelNegativo() {
        BigDecimal custoFixo = new BigDecimal("300.00");
        BigDecimal custoVariavel = new BigDecimal("-2.50");
        int numCorridas = 200;
        Taxi taxi = new Taxi(custoFixo, custoVariavel, numCorridas);
        assertEquals(custoFixo, taxi.calculaCustoMensal(), "O custo mensal do táxi com custo variável negativo deve ser corrigido");
    }

    @Test
    public void testTremUrbanoComCustoValido() {
        BigDecimal custo = new BigDecimal("1000.00");
        BigDecimal custoPorKm = new BigDecimal("0.50");
        int kmRodados = 1000;
        TremUrbano trem = new TremUrbano(custo, custoPorKm, kmRodados);
        BigDecimal custoEsperado = custo.add(custoPorKm.multiply(BigDecimal.valueOf(kmRodados)));
        assertEquals(custoEsperado, trem.calculaCustoMensal(), "O custo mensal do trem urbano está incorreto");
    }

    @Test
    public void testTremUrbanoComCustoPorKmNegativo() {
        BigDecimal custo = new BigDecimal("1000.00");
        BigDecimal custoPorKm = new BigDecimal("-0.50");
        int kmRodados = 1000;
        TremUrbano trem = new TremUrbano(custo, custoPorKm, kmRodados);
        assertEquals(custo, trem.calculaCustoMensal(), "O custo mensal do trem urbano com custo por Km negativo deve ser corrigido");
    }

    @Test
    public void testOnibusComCustoZero() {
        BigDecimal custo = BigDecimal.ZERO;
        Onibus onibus = new Onibus(custo);
        assertEquals(BigDecimal.ZERO, onibus.calculaCustoMensal(), "O custo mensal do ônibus com custo zero está incorreto");
    }

    @Test
    public void testBicicletaCompartilhadaComCustoValido() {
        BigDecimal custoFixo = new BigDecimal("500.00");
        BigDecimal custoManutencaoPorUnidade = new BigDecimal("20.00");
        int numeroDeBicicletas = 100;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);
        BigDecimal custoEsperado = custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(numeroDeBicicletas));
        assertEquals(custoEsperado, bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta compartilhada está incorreto.");
    }

    @Test
    public void testBicicletaCompartilhadaComCustoManutencaoNegativo() {
        BigDecimal custoManutencaoPorUnidade = new BigDecimal("-20.00"); // Valor negativo
        int numeroDeBicicletas = 100;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);

        BigDecimal custoEsperado = custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(numeroDeBicicletas));
        assertEquals(BigDecimal.ZERO, bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta com custo de manutenção negativo deve ser igual ao custo fixo.");
    }

    @Test
    public void testBicicletaCompartilhadaComNumeroDeBicicletasNegativo() {
        BigDecimal custoManutencaoPorUnidade = new BigDecimal("20.00");
        int numeroDeBicicletas = -100;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);

        BigDecimal custoEsperado = custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(0));
        assertEquals(custoEsperado, bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta com número de bicicletas negativo deve ser igual ao custo fixo.");
    }


    @Test
    public void testBicicletaCompartilhadaComCustoFixoZero() {
        BigDecimal custoManutencaoPorUnidade = new BigDecimal("20.00");
        int numeroDeBicicletas = 100;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);

        BigDecimal custoEsperado = custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(numeroDeBicicletas));

        assertEquals(custoEsperado, bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta com custo fixo zero deve ser apenas o custo de manutenção por unidade das bicicletas.");
    }

    @Test
    public void testBicicletaCompartilhadaComCustoManutencaoZero() {
        BigDecimal custoManutencaoPorUnidade = BigDecimal.ZERO;
        int numeroDeBicicletas = 100;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);

        assertEquals(custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(numeroDeBicicletas)), bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta com custo de manutenção zero deve ser igual ao custo fixo.");
    }

    @Test
    public void testBicicletaCompartilhadaComZeroBicicletas() {
        BigDecimal custoManutencaoPorUnidade = new BigDecimal("20.00");
        int numeroDeBicicletas = 0;

        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada(custoManutencaoPorUnidade, numeroDeBicicletas);

        assertEquals(custoManutencaoPorUnidade.multiply(BigDecimal.valueOf(0)), bicicleta.calculaCustoMensal(), "O custo mensal da bicicleta com zero bicicletas deve ser igual ao custo fixo.");
    }

}
