package com.michal.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CardParser{

    protected static ArrayList<String> readFileToList(String filename) throws IOException {
        
        ArrayList<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(filename))) {

            while (s.hasNext()) {
                result.add(s.nextLine());
                
            }
            return result;
        }
    }
    public static List<List<String>> readFileTo2DList(String filename) throws IOException{
        List<List<String>> pokemonList = new ArrayList<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(" ");
                    pokemonList.add(Arrays.asList(values));      
    
        }
        return pokemonList;
        }
    }


}
