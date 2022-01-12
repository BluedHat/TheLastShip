/* Impressão do tabuleiro dos jogadores */

package com.account;
import com.core.Printer;
import com.core.Scan;
import com.places.Sea;


public class Playerdata {
    public static void playerTable() {
        Printer.Table(Scan.player1, "Atlantico", Sea.Atlantico,true);
        Printer.Table(Scan.player2, "Pacífico",  Sea.Pacifico,false);
    }

}