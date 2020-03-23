package com.michal.oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameModes {

    public void PVP() throws IOException {
        Scanner scanner = new Scanner(System.in);

        Player newPlayer = new Player();
		View newView = new View();
		Battle newBattle = new Battle();

		ArrayList<ArrayList<String>> Set1 = newPlayer.randomizePlayerSet();
		ArrayList<ArrayList<String>> Set2 = newPlayer.randomizePlayerSet();

		String identifyPlayer = "Player1";
		int choice = 0;
		int listSize = Set1.size();

		System.out.println("***Welcome player in Pokemon Battle Card Game.***");
		System.out.println("***Each player will obtain set with 5 Pokemons.***");
		System.out.println("Lets play.");

		while(listSize>0){

			newView.printPlayersSets(Set1, Set2);


            ArrayList<String> Card1 = newPlayer.chooseCard(choice, Set1);
            ArrayList<String> Card2 = newPlayer.chooseCard(choice, Set2);

			newView.printPlayersCards(Card1, Card2);

			System.out.println(identifyPlayer  + ": What attribute do you want to play? Fire 1, Water 2, Leaf 3, Electric 4?");
			int attribute = scanner.nextInt();

			boolean checkWinner = newPlayer.compareCards(Card1, Card2, attribute);

			newBattle.redistributeCardsToPlayers(checkWinner, Set1, Set2, Card1, Card2, choice);
			newBattle.checkWin(checkWinner);

			newView.printBattleResult(Set1, Set2, listSize, checkWinner);

			if(checkWinner){
				identifyPlayer= "Player1";
			} else{
				identifyPlayer = "Player2";
			}


			if((Set1.size()==0) || (Set2.size()==0)){
				System.out.println("End of the Game");
				break;

            }
        }
        scanner.close();
    }
}