/* Navio Tanque 4 casa*/

package com.army;

public class Tanker implements  Shield {
    private int size = 4;
    private String name = "Navio-Tanque";
    private String symbol = "T";
    private int qtd = Sort.Tanker;

    @Override
    public String name() {return name;}

    @Override
    public String symbol() {return symbol;}

    @Override
    public int qtd() {return qtd;}

    @Override
    public int size() {return size;}
}
