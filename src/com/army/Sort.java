/* Objetivo -  sistema de distribuição de navios por jogo. Funcionar através da
* escolha aleatoria da quantidade por modelo controlando o tamanho total da armada */

package com.army;

import com.account.Gameplay;
import java.util.ArrayList;
import java.util.Random;

public class Sort {
    public static Random place = new Random();
    public static int limit = Gameplay.mode;
    public static int Aerocarryer, Destroyer,Tanker,Submarine,Boat;
    public static int fix = 0;
    public static ArrayList<Shield> Armylist = new ArrayList< >();

    public static ArrayList<Shield> SelectArmy(){

       do{
            int get = place.nextInt(6);
            switch(get){
                case 1:
                    fix  = place.nextInt(limit);
                    Boat += fix;
                    limit -= fix;
                case 2:
                    fix  = place.nextInt(limit);
                    Submarine += fix/2;
                    limit -= fix;
                case 3:
                    fix  = place.nextInt(limit);
                    Destroyer += fix/3;
                    limit -= fix;
                case 4:
                    fix  = place.nextInt(limit);
                    Tanker += fix/4;
                    limit  -= fix;
                case 5:
                    fix  = place.nextInt(limit);
                    Aerocarryer += fix/5;
                    limit -= fix;
            }
        }
       while (limit > 1);

       Armylist.add(new Aerocarryer());
       Armylist.add(new Destroyer());
       Armylist.add(new Tanker());
       Armylist.add(new Submarine());
       Armylist.add(new Boat());

       return Armylist;
    }

}






