package com.bridgelabs.snakeladdergame;
import java.util.Random;

public class SnakeLadderGame {
    static int DICE;
    static int STARTPOSITION = 0;
    static int WINNINGPOSITION = 100;
    public static void main(String[] args) {

        System.out.println("Start The Game By Rolling The Dice From Start Position :" + STARTPOSITION);
        Random a = new Random();
        DICE = a.nextInt(6)+1;
        System.out.println("Number get on Dice : " +DICE);
        if(DICE == 0 ){
            System.out.println("Sorry No Play");

        }else if(DICE == 3){
            System.out.println("Oop's There is SNAKE");
        }
        else if(DICE == 5){
            System.out.println("Go Up..! There is Ladder");
        }
        else {
            System.out.println("Play Again");
        }

    }
}
