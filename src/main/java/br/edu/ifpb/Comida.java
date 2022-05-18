package br.edu.ifpb;

import java.time.LocalDate;

public class Comida extends Item implements Taxavel{
    Comida( String produto, double valor) {
        super("comida", produto, valor);
    }
    public double taxas(LocalDate date){
        return this.preco() * 0.1; // 10%
    }
}
