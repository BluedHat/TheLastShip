/* Submarino 2 casas*/

package com.army;

public class Submarine implements Shield{
    private int size = 2;
    private String name = "Submarino";
    private String symbol = "S";
    private int qtd = Sort.Submarine;

    @Override
    public String name() {return name;}

    @Override
    public String symbol() {return symbol;}

    @Override
    public int qtd() {return qtd;}

    @Override
    public int size() {return size;}
}
