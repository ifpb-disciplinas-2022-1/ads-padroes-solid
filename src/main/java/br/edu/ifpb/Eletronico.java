package br.edu.ifpb;

import java.time.LocalDate;
import java.time.Month;

public class Eletronico extends Item implements Taxavel{
    Eletronico(String produto, double valor) {
        super("eletronico", produto, valor);
    }
    public double taxas(LocalDate date){
        if(Month.NOVEMBER.equals(date.getMonth())){//novembro
            return this.preco() * 0.1; // 10%
        }
        return this.preco() * 0.2; // 20%
    }
}
