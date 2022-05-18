package br.edu.ifpb;

import java.time.LocalDate;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalcularTaxasTest {

    @Test
    public void testTaxasEmEletronicos(){
        Eletronico celular = new Eletronico("celular", 500.00);
        CalculaTaxas calcular = new CalculaTaxas(celular);
        double taxas = calcular.calcular(LocalDate.now());
        double esperado = 100.0;
        assertEquals(esperado, taxas, 0.0001);
    }
    @Test
    public void testTaxasEmEletronicosNaBlackFriday(){
        Eletronico celular = new Eletronico("celular", 500.00);
        CalculaTaxas calcular = new CalculaTaxas(celular);
        double taxas = calcular.calcular(
                LocalDate.of(2022, 11, 01)
        );
        double esperado = 50.0;
        assertEquals(esperado, taxas, 0.0001);
    }
}
