/* Objetivo do arquivo -  geração de jogadas pelo computador.
* O controle das jogadas já realizadas é feito através da composição do tabuleiro
* simulado - Simulated - o resultado deste  arquivo é utilizado no arquivo Round */

package com.account;
import java.util.Random;

public class Computer {
    public static Random PlayRand = new Random();
    public static int [][] Simulated = new int[10][10];

    public static int[] ComputerPlay(){

        int posx = PlayRand.nextInt(9);
        int posy = PlayRand.nextInt(9);
        int[] mark = new int[2];
        boolean trueplay = false;

        do{
            if(Simulated [posx][posy] == 0){
                mark[0] = posx;
                mark[1] = posy;
                Simulated [posx][posy]  = 1;
                trueplay = true;
            }
            else {
                posx = PlayRand.nextInt(9);
                posy = PlayRand.nextInt(9);
            }
        }
        while (!trueplay);

        return mark;

}
}
