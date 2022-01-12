/* Barco  1 Casa */

package com.army;

public class Boat implements Shield {
    private int size = 1;
    private String name = "Navio";
    private String symbol = "N";
    private int qtd = Sort.Boat;

   @Override
    public String name() {return name;}

    @Override
    public String symbol() {return symbol;}

    @Override
    public int qtd() {return qtd;}

    @Override
    public int size() {return size;}

}

