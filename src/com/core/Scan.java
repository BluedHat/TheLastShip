package com.core;
import com.account.Gameplay;
import com.account.Round;

import static java.lang.System.*;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Scan {
    public Scan() {
    }

    static Scanner UserEntry = new Scanner(System.in);
    public static String player1,player2;

    public static void scanUserNames(){
        /*Nome dos Jogadores */
        out.println("Digite o nome do Jogador 1: ");
        player1 = UserEntry.nextLine();
        player2 = "Computer";
    }

    public static void scanPlayEntry(){
        out.println("Vamos ao Ataque? Digite um valor de 1 a 10!!!  ");
        Round.getShootH   = UserEntry.next();
        out.println("Vamos ao Ataque? Digite um valor de A a J( Em CapsLock)!!!  ");
        Round.getShootV   = UserEntry.next();
    }

    public static void scanUserEntry() {
        /* Entrada de dados do tabuleiro vai para o arquivo sea*/


        for (; ; ) {
            boolean letsStart = false;
            try {
                out.println("Escolha um nível de Jogo: ");
                out.println("1 = Fácil: ");
                out.println("2 = Médio: ");
                out.println("3 = Dificil: ");
                int GameOption = UserEntry.nextInt();
                out.println("Sua armada ocupará" + " " + Gameplay.GameMode(GameOption) + " "+ "posições no tabuleiro");
                letsStart = true;
            } catch (InputMismatchException Erro) {
                System.out.println("Por favor, insira um valor numerico");
            }
            if (letsStart) {
                break;
            }
        }
    }
}

