package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Teste {
    @org.junit.jupiter.api.Test
    public void Teste() {
        // todo fazer os testes de cenario aqui nesse arquivo
        assertTrue(true);

        //onibus
        public void testCadastrarOnibus () {
            double custoFixo = 500.0;
            double resultado = SistemaCadastroVeiculos.validarCusto(custoFixo);
            assertEquals(500.0, resultado, "O custo fixo do ônibus deve ser igual a 500.0");

            double custoNegativo = -100.0;
            resultado = SistemaCadastroVeiculos.validarCusto(custoNegativo);
            assertEquals(0.0, resultado, "Custos negativos devem ser convertidos para 0");
        }




    }
}
