/* Com auxilio de CheckColab verificar se o navio cabe dentro do espaço alocado*/

package com.places;

public class CheckSpace {

    public static boolean checkSpace(int line, int col, int land, int size, int[][] seasize) {
        if (land == 0) {
            if (line > (9 - size)) {
                return false;
            }
            CheckColab.CheckColabV(size, line, col, seasize);

            }
            if (land == 1) {
                if (col > (9 - size)) {
                    return false;
                }
                CheckColab.CheckColabH(size, line, col, seasize);
            return true;
            }
            return false;
        }

    }
