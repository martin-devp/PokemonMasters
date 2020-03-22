package com.michal.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Battle {
    Player player;

    public void redistributeCardsToPlayers(boolean isWin, ArrayList<ArrayList<String>> Set1, ArrayList<ArrayList<String>> Set2, ArrayList<String> Card1, ArrayList<String> Card2, int index){
        if(isWin){
            Set1.add(Card2);
            Set1.add(Card1);

            Set2.remove(0);
            Set1.remove(0);

        } else{
            Set2.add(Card1);
            Set2.add(Card2);

            Set1.remove(0);
            Set2.remove(0);
        }
    }

    public void checkWin(boolean checkStatus){
        if(checkStatus){
            System.out.println("Player1: You won this round, you are taking opponents card.");
        } else{
            System.out.println("Player2: You won this round, you are taking opponents card.");
        }
    }

    public void roundWinner(boolean whoWon, String identifyPlayer){
        if(whoWon){
            System.out.println("Player1 is called");
            identifyPlayer  = "Player1";
        } else {
            System.out.println("Player2 is called");
            identifyPlayer = "Player2";
        }
    }
    public boolean setWinner(boolean checkWinner){
        if(checkWinner){
            return true;
        } else{
            return false;
        }
    }
    public boolean setRandomWinner(){
        Random randomNumber = new Random();
        int playerOneNumber = randomNumber.nextInt(1000);
        int playerTwoNumber = randomNumber.nextInt(1000);
        if(playerOneNumber>playerTwoNumber){
            System.out.println("Player1 was chosen by RNG God");
            return true;
        } else if(playerOneNumber==playerTwoNumber){
            System.out.println("RNG draw! This is madness! Again");
            return setRandomWinner();
        }
        System.out.println("Player2 was chosen by RNG God");
        return false;

    }
}