package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/05/2022, 08:29:02
 */
public class Pedido {
    private final List<Item> itens = new ArrayList<>();
    private final LocalDate criadoEm = LocalDate.now();
    double total() {
        return 0.0;
    }
    public double calcularTaxas() {
        return 0.0;
//        double taxas = 0.0;
//        for (Item item: itens) {
//            if("eletrônico".equals(item.categoria())){
//                taxas +=  item.preco() * 0.2;
//            }
//            if("comida".equals(item.categoria())){
//                taxas +=   item.preco() * 0.1;
//            }
//        }
//        return taxas;
    }
    double subTotal() {
        return 0.0;
    }
    void adicionar(Item item) {
       this.itens.add(item);
    }
}
