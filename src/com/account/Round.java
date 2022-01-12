/* Objetivo: Administração das jogadas*/

package com.account;
import com.core.Scan;

import static java.lang.System.*;
import java.util.List;

public class Round {

    public static boolean finished = false;
    public static String getShootH;
    public static String getShootV;
    public static String[] Entry = new String[2];
    public static List SubstanceC = List.of(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
    public static List SubstanceL = List.of(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
    public static boolean ValidInput = true;

    public static Boolean CheckInput() {
        Entry[0] = getShootH;
        Entry[1] = getShootV;

        boolean checkLine;
        if (SubstanceL.contains(Entry[0]) && SubstanceC.contains(Entry[1])) ValidInput = true;
        else ValidInput = false;

        return ValidInput;
    }

    public static int[] Round() {
        String shoot = getShootV.toLowerCase();
        int[] position = new int[2];

        position[0] = (Integer.parseInt(getShootH) - 1);
        position[1] = shoot.charAt(0) - 97;

        return position;
    }

    public static void PlayerRound(String Name, int[] position, int[][] Tabuleiro) {

        if (Name.equals("Computer")) {
                if ((Player.livesc > 0) && (Player.playerArmyc > 0)) {
                if (Tabuleiro[position[0]][position[1]] == 1) {
                    Player.livesc += 1;
                    Player.shootsc += 1;
                    Player.pointsc += 1;
                    Player.playerArmyc -= 1;
                    Player.turnc += 1;
                    Tabuleiro[position[0]][position[1]] = 3;

                } else {
                    Player.livesc -= 1;
                    Player.shootsc -= 1;
                    Player.pointsc -= 1;
                    Player.turnc += 1;
                    Tabuleiro[position[0]][position[1]] = 2;
                }
            } else if (Player.livesc == 0) {
                     Player.statusc = "loser";
                     finished = true;
              } else if (Player.playerArmyc == 0) {
                     Player.statusc = "winner";
                     finished = true;
              }else if ((Player.livesc == 0) && (Player.livesp == 0)) {
                    Player.livesc += 1;
                    Player.livesp += 1;
                }
        }
        else if ((Player.livesp > 0) && (Player.playerArmyp > 0)) {
               if (Tabuleiro[position[0]][position[1]] == 1) {
                  Player.livesp += 1;
                  Player.shootsp += 1;
                  Player.pointsp += 1;
                  Player.playerArmyp -= 1;
                  Player.turnp += 1;
                  Tabuleiro[position[0]][position[1]] = 3;
              }
               else {
                  Player.livesp -= 1;
                  Player.shootsp -= 1;
                  Player.pointsp -= 1;
                  Player.turnp += 1;
                  Tabuleiro[position[0]][position[1]] = 2;
              }
        } else if (Player.livesp == 0) {
            out.println("Poxa," + " " + Name +" " +  "fim de jogo, você perdeu");
            finished = true;
            Player.statusp = "loser";
        } else if (Player.playerArmyp == 0) {
            out.println("Aehhh," + " " + Name +" " + "fim de jogo, você ganhou");
            finished = true;
            Player.statusp = "winner";

        } else if ((Player.livesc == 0) && (Player.livesp == 0)) {
            out.println("It's can't be rigth you and a Computer are Draw....One life for each....");
            out.println("This is the final lap....");
            Player.livesc += 1;
            Player.livesp += 1;
        }
    }
}

