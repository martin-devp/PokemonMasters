package com.michal.oop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CardParserImpl implements CardParserDAO {
    String fileName = "Cards.csv";

    public ArrayList<String> readFileToList(String fileName) throws FileNotFoundException {

        ArrayList<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(fileName))) {

            while (s.hasNext()) {
                result.add(s.nextLine());
            }
            return result;
        }
    }
    public List<List<String>> readFileTo2DList(String fileName) throws IOException{
        List<List<String>> pokemonList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(" ");
                pokemonList.add(Arrays.asList(values));
            }
            return pokemonList;
        }
    }
    public List<String> separateStringToList(int index) throws IOException {
        String elementsData = readFileToList(fileName).get(index);
        String[] elements = elementsData.split(",");
        List<String> elementsList = Arrays.asList(elements);
        ArrayList<String> listOfString = new ArrayList<String>(elementsList);
        return listOfString;
    }
    public String getName(int index) throws IOException {
        String name = separateStringToList(index).get(0);
        return name;
    }
    public String getFire(int index) throws IOException {
        String fire = separateStringToList(index).get(1);
        return fire;
    }
    public String getWater(int index) throws IOException {
        String water = separateStringToList(index).get(2);
        return water;
    }
    public String getLeaf(int index) throws IOException {
        String water = separateStringToList(index).get(3);
        return water;
    }



}

