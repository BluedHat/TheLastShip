/* Contratorpedeiro 3 casas */

package com.army;

public class Destroyer implements Shield {
    private int size = 3;
    private String name = "Contratorpedeiro";
    private String symbol = "C";
    private int qtd = Sort.Destroyer;

    @Override
    public String name() {return name;}

    @Override
    public String symbol() {return symbol;}

    @Override
    public int qtd() {return qtd;}

    @Override
    public int size() {return size;}

}
