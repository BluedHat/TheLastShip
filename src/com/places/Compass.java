/* Objetivo decidir de forma randômica se o navio será posicionado na vertical ou horizontal*/

package com.places;

import java.util.Random;

public class Compass {
    public static Random rand = new Random();

   public static int Compass (){
      /* 0 =  Vertical 1 | = Horizontal */
      int Position = rand.nextInt(2);
      return Position;
  }

}
