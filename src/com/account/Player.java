/* Este arquivo possui as váriaveis básicas de jogo(pontos, vida turnos). Para o computador (
* itens terminados em C e para o Player itens terminados em P. Exemplo vidas do computador livesc */

package com.account;
import com.core.Scan;

public class Player {
    public static String  playerp = Scan.player1;
    public static int livesp   = 30;
    public static int shootsp = 30;
    public static int pointsp  = 15;
    public static int turnp   = 0;
    public static int playerArmyp = Gameplay.mode;
    public static String statusp = "live";

    public static String  playerc = Scan.player2;
    public static int livesc   = 30;
    public static int shootsc = 30;
    public static int pointsc  = 15;
    public static int turnc   = 0;
    public static int playerArmyc = Gameplay.mode;
    public static String statusc = "live";
}
