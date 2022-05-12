package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/05/2022, 08:39:48
 */
public class Item {
    private final String categoria;
    private final String produto;
    private final double preco;
    Item(String categoria,String produto,double valor) {
        this.preco = valor;
        this.produto = produto;
        this.categoria = categoria;
    }
    public double preco(){
        return this.preco;
    }
    public String categoria() {
        return this.categoria;
    }
}
