package br.edu.ifpb;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Test;
import static org.junit.Assert.*;
public class PedidoTest {
    @Test
    public void testCalcularValorSubTotal() {
        //given
        Pedido pedido = new Pedido();
//        pedido.adicionar(new Item("eletrônico", "celular", 550.00));
//        pedido.adicionar(new Item("eletrônico", "tv", 450.00));
        //then
        double total = pedido.subTotal();
        double esperado = 0.0;
        //verify 1000.0001 == 1000.0002
        assertEquals(esperado,total, 0.001);
    }
    @Test
    public void testCalcularTaxas() {
    }
    @Test
    public void testCalcularValorTotal() { //SRP
    }
    @Test
    public void testCalcularValorComBebida() { //OCP
    }
    @Test
    public void testCalcularValorComTaxas() { //ISP + LSP
    }
    @Test
    public void testCalcularValorTotalBlackFriday() { //DIP
    }
}