/* O objetivo deste arquivo é definir a quantidade maxima de navios com base no nivel
* de jogo escolhido pelo jogador */

package com.account;

public class Gameplay {
    Gameplay(){

    }

public static int mode;

public static int GameMode(int GameOption){

    if(GameOption == 1){
        mode =  100/3;
    }
    else if(GameOption == 2){
        mode =  100/4;
    }
    else if(GameOption == 3){
        mode =  100/5;
    }

    return mode;
}
}

