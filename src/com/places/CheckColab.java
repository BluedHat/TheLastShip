/* Objetivo verificar se há espaço livre para o navio ser colocado em água*/

package com.places;

public class CheckColab {

    public static boolean CheckColabV(int size, int lin, int col, int[][] matrix) {
         for (int row = 0; row < size; row++) {
            if (matrix[lin][col] == 0) {
                lin++;

            } else {
                return false;
            }
        }
    return true;
    }

    public static boolean CheckColabH(int size, int lin, int col, int[][] matrix) {
        for (int colu = 0; colu < size; colu++) {
            if (matrix[lin][col] == 0) {
                col++;
            } else {
                return false;
            }
        }
        return true;
    }
}
