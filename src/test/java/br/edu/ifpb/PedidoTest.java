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
        pedido.adicionar(new Eletronico( "celular", 550.00));
        pedido.adicionar(new Eletronico("tv", 450.00));
        //then
        double total = pedido.subTotal();
        double esperado = 1000.0;
        //verify 1000.0001 == 1000.0002
        assertEquals(esperado,total, 0.001);
    }
    @Test
    public void testCalcularTaxas() {
        //given
        Pedido pedido = new Pedido();
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Eletronico("tv", 600.00)); //120
        //then
        double taxas = pedido.calcularTaxas();
        double esperado = 220.00;
        //verify
        assertEquals(esperado, taxas, 0.0001);

    }
    @Test
    public void testCalcularValorTotal() { //SRP
        //given
        Pedido pedido = new Pedido();
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida("arroz", 600.00)); //60
        //then
        double taxas = pedido.total(); // 1100 + 160
        double esperado = 1260.00;
        //verify
        assertEquals(esperado, taxas, 0.0001);
    }
    @Test
    public void testCalcularValorComBebida() { //OCP
//         given
        Pedido pedido = new Pedido();
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida( "arroz", 600.00)); //60
        pedido.adicionar(new Bebida("gin com tônica", 50.00)); //0
        //then
        double taxas = pedido.total(); // 1150 + 160
        double esperado = 1310.00;
        //verify
        assertEquals(esperado, taxas, 0.0001);
    }
    @Test
    public void testCalcularValorComTaxas() { //ISP + LSP
        // given
        Pedido pedido = new Pedido();
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida( "arroz", 600.00)); //60
        pedido.adicionar(new Bebida("gin com tônica", 50.00)); //0
        //then
        double taxas = pedido.total(); // 1150 + 160
        double esperado = 1310.00;
        //verify
        assertEquals(esperado, taxas, 0.0001);
    }
    @Test
    public void testCalcularValorTotalBlackFriday() { //DIP
        Pedido pedido = new Pedido(
                LocalDate.of(2022, 11, 01)
        );
        pedido.adicionar(new Eletronico( "celular", 500.00)); //50
        pedido.adicionar(new Comida( "arroz", 600.00)); //60
        pedido.adicionar(new Bebida("gin com tônica", 50.00)); //0
        //then
        double taxas = pedido.total(); // 1150 + 160
        double esperado = 1260.00;
        //verify
        assertEquals(esperado, taxas, 0.0001);
    }
}