package br.edu.ifpb;

import java.time.LocalDate;

public class CalculaTaxas {
    private final Item item;
    public CalculaTaxas(Item item) {
        this.item = item;
    }
    public double calcular(LocalDate date){
        if(taxavel()){
            return transformar().taxas(date);
        }
        return  0.0;
    }
    private Taxavel transformar() {
        return (Taxavel) item;
    }
    private boolean taxavel() {
        return item instanceof Taxavel;
    }
}
