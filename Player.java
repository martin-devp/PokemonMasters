package com.michal.oop;

import java.util.ArrayList;
import java.util.Random;

public class Player extends XMLParser {

    public  ArrayList<ArrayList<String>> randomizePlayerSet() {
        ArrayList<ArrayList<String>> playerSet = new ArrayList<ArrayList<String>>();
        Random random = new Random(); 
        
        
        for(int i = 1; i<6; i++){
            int randInt = random.nextInt(30);
            ArrayList<String> onePokemon = new ArrayList<String>();
            onePokemon = PokemonList().get(randInt);
            playerSet.add(onePokemon);

        }
        return playerSet;
        
    }
    public ArrayList<String> chooseCard(int indexCard, ArrayList<ArrayList<String>> playerSet){
       return playerSet.get(indexCard);

   
    }
    public boolean compareCards(ArrayList<String> playerOneCard, ArrayList<String> playerTwoCard, int index){
        String playerOneAttribute = playerOneCard.get(index);
        String playerTwoAttribute = playerTwoCard.get(index);

        int attributeOneToInt = Integer.parseInt(playerOneAttribute);
        int attributeTwoToInt = Integer.parseInt(playerTwoAttribute);

        if(attributeOneToInt > attributeTwoToInt){
            return true;
        } else if(attributeOneToInt == attributeTwoToInt){
            System.out.println("Attributes draw! RNG God must decide!");
            return setRandomWinner();
        }
        return false;
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