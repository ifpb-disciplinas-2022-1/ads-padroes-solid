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
    private final LocalDate criadoEm;
    public Pedido(){
        this(LocalDate.now());
    }
    public Pedido(LocalDate date) {
        this.criadoEm = date;
    }
    double total() {
        return subTotal() + calcularTaxas();
    }
    public double calcularTaxas() {
        return itens.stream()
                .map(CalculaTaxas::new)
                .mapToDouble(item -> item.calcular(criadoEm))
                .sum();
    }
    double subTotal() {
        return this.itens.stream()
                .mapToDouble(Item::preco)
                .sum();
    }
    void adicionar(Item item) {
       this.itens.add(item);
    }
}
