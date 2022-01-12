/* Porta Aviões 5 Casas */

package com.army;

public class Aerocarryer implements Shield{
    private int size = 5;
    private String name = "Porta-Aviões";
    private String symbol = "P";
    private int qtd = Sort.Aerocarryer;

    @Override
    public String name() {return name;}

    @Override
    public String symbol() {return symbol;}

    @Override
    public int qtd() {return qtd;}

    @Override
    public int size() {return size;}

}
