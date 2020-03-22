package com.michal.oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class View extends CardParserImpl {
    CardParserImpl cardParser;
    
    
    public void printCard(ArrayList<String> Card) throws IOException {
        String name = Card.get(0);
        String fire = Card.get(1);
        String water = Card.get(2);
        String leaf = Card.get(3);
        String electric = Card.get(4);
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("|----------------------|");
        System.out.println("|     Name: " + name + "");
        System.out.println("|----------------------|");
        System.out.println("|     Fire: " + fire + "         |" );
        System.out.println("|    Water: " + water + "         |" );
        System.out.println("|     Leaf: " + leaf + "         |" );
        System.out.println("| Electric: " + electric + "         |" );
        System.out.println("|----------------------|");
        System.out.println("|______________________|");
    }
    public void printBattleResult(ArrayList<ArrayList<String>> Set1, ArrayList<ArrayList<String>>Set2, int listSize, boolean checkWinner){
        if((countElementsInSet(Set1)>0) && (countElementsInSet(Set1)>0)){
            System.out.println("Next round");
        } else if(checkWinner){
            System.out.println("******************");
            System.out.println("******************");
            System.out.println("You won this game, Player 1!");
            System.out.println("  PokemonMaster");
            System.out.println("******************");
            System.out.println("******************");;            
        } else if(!checkWinner){
            System.out.println("******************");
            System.out.println("******************");
            System.out.println("You won this game, Player 2!");
            System.out.println("  PokemonMaster");
            System.out.println("******************");
            System.out.println("******************");
            
        }
    }
    public void printPlayersSets(ArrayList<ArrayList<String>> Set1, ArrayList<ArrayList<String>> Set2){
        System.out.println("Player1: This is your set: " + Set1);
		System.out.println("Player2: This is your set: " + Set2);
    }
    public void printPlayersCards(ArrayList<String> Card1, ArrayList<String>  Card2) throws IOException {
        System.out.println("Player1: Your Pokemon");
	    printCard(Card1);
		System.out.println("Player2: Your Pokemon");
        printCard(Card2);
    }
    public int countElementsInSet(ArrayList<ArrayList<String>> Set){

        int count = 0;

        for(ArrayList<String> Count : Set){
            count++;

        }
        return count;
    }
    
}