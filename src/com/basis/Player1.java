/* TODO - A ser usado na expansão multiplayer */

package com.basis;
import com.account.Gameplay;
import com.basis.PlayerBase;
import com.core.Scan;

public class Player1 implements PlayerBase {
    private String  player = Scan.player1;
    private int lives   = 30;
    private  int shoots = 30;
    private int points  = 0;
    private  int turn   = 0;
    private  int playerArmy = Gameplay.mode;
    private  String status = "live";

    @Override
    public String player(){return player;}
    @Override
    public int lives(){return lives;}
    @Override
    public int shoots(){return shoots;}
    @Override
    public int points(){return points;}
    @Override
    public int turn(){return turn;}
    @Override
    public int playerArmy(){return playerArmy;}
    @Override
    public String status(){return status;}



}
