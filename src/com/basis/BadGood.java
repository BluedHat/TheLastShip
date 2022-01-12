package com.basis;

import java.util.Random;

/* TODO - A ser usado na expansão multiplayer */

import static java.lang.System.*;

public class BadGood {
    private static final Random rand = new Random();

    public static String Good() {
        int answerG = rand.nextInt(4);
        String playTextGood = "Aehhhhhh";
        switch (answerG) {
            case 1:
                playTextGood = "That's it";
            case 2:
                playTextGood = "Nice Shoot";
            case 3:
                playTextGood = "Bingo";
                break;
        }
        return playTextGood;
    }

    public static String Bad() {
        int answerB = rand.nextInt(4);
        String playTextBad = "Ahhhhhhh";
                switch (answerB) {
                case 1:
                    out.println("Oh no");
                case 2:
                    out.println("Uhmmmm");
                case 3:
                    out.println("Try again");
                    break;
            }
          return playTextBad;
    }
}
