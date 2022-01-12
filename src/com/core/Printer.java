package com.core;
import com.account.Player;
import com.account.Round;

import static java.lang.System.*;

public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void ColumnSpace() {
        char firstLetter = 65 /* Letra A no ASCII */;
        String columnNames = "   ";

        for(int i = 0; i < 10; i++) {
            columnNames += "  " + (firstLetter++) + " ";
        }
        System.out.println(columnNames);
    }

    public static void PointerSpace() {
        char pointer = 45 /* Simbolo - */;
        String pointerNames = "|";
        for(int i = 0; i < 5; i++) {
            pointerNames +=  "  " + (pointer) + " ";
        }
        System.out.print(pointerNames);
    }

    public static void CallDetails(Object playerName, String Name){
        out.println("");
        PointerSpace();
        out.print("|"+ playerName);
        PointerSpace();
        out.print("|");
        out.println("");
        PointerSpace();
        out.print("|"+ Name);
        PointerSpace();
        out.print("|");
        out.println("");
    }

        public static void Table(Object playerName, String Name ,int[][] Table, boolean playerTable){
        CallDetails(playerName,Name);
        ColumnSpace();
        String lineTable;
        int lineNumber = 1;
        for(int[] line : Table) {
            lineTable = String.format("%02d",lineNumber++) ;
            for (int colum : line) {
                switch(colum) {
                    case 0 : // Vazio ou sem ação
                            lineTable += " | ~";
                        break;
                    case 1 : // Navio
                        if (playerTable) {
                            lineTable += " | N";
                            break;
                        } else {
                            lineTable += " | ~";
                            break;
                        }
                    case 2 : // Erro
                            lineTable += ANSI_RED + " | X" + ANSI_RESET;
                        break;

                    case 3 : // Acertou
                            lineTable += ANSI_BLUE + " | *" + ANSI_RESET;
                        break;
                }
            }
            System.out.println(lineTable);
        }
    }

    public static void EndGame(){
        if(Round.finished){
            out.println("------------------------------- RESUMO ---------------------------------------");
            out.println("Jogador"+" "+ "|" +"Vidas Restantes" +"|" + "Turnos"     + "|" + "Pontos");
            out.println(Scan.player1 + "|" + Player.livesp    +"|" + Player.turnp + "|" + Player.pointsp);
            out.println(Scan.player2 + "|" + Player.livesc    +"|" + Player.turnc + "|" + Player.pointsc);
        }
    }

}
