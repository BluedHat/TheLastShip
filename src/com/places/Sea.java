/* Objetivo: Lógica de Criação dos tabuleiros bem como distribuição dos Navios*/

package com.places;
import com.account.Gameplay;
import com.army.Shield;
import com.army.Sort;

import java.util.Random;
import java.util.stream.IntStream;

public class Sea {
    public static Random rand = new Random();
    public static int lin = rand.nextInt(10);
    public static int col = rand.nextInt(10);
    public static boolean check = false;
    public static int[][] Atlantico, Pacifico;

    public static int army = Gameplay.mode;

    public static int[][] Initialize(){
        int [][] xy = new int[10][10];

        /* Gera o tabuleiro base com valor 0 */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                xy[i][j] = 0;
            }
        }

        return xy;
    }

    public static void InitializePlayerTables(){
        Atlantico = Initialize();
        Pacifico = Initialize();
    }

    public static int[][] PopulateSea( ){

    /* Distribui os navios em posições aleatorias */
            int[][] WarmSea = Initialize();
            for (Shield shield : Sort.Armylist) {
                int counter = 0;
                while (shield.qtd() > counter) {
                 check = CheckSpace.checkSpace(lin, col, Compass.Compass(), shield.size(), WarmSea);
                    if (!check) {
                        while (!check) {
                            lin   = rand.nextInt(10);
                            col   = rand.nextInt(10);
                            check =  CheckSpace.checkSpace(lin, col, Compass.Compass(), shield.size(), WarmSea);
                        }
                    }
                        if (0 == Compass.Compass()) {
                            IntStream.range(0, shield.size()).forEach(v -> {
                                WarmSea[lin][col] = 1;
                                if(lin < 9){
                                    lin++;
                            }});
                        } else if (Compass.Compass() == 1) {
                            IntStream.range(0, shield.size()).forEach(h -> {
                                WarmSea[lin][col] = 1;
                                if(col < 9) {
                                    col++;
                                }});
                        }
                    counter++;
                }
            }

  return WarmSea;
 }

    public static void StartGame(){
        Atlantico = PopulateSea();
        Pacifico  = PopulateSea();
    }


}