package com.michal.oop;

import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XMLParser {

    String pathname = "src/main/resources/data.xml";

    public ArrayList<ArrayList<String>> PokemonList(){

        ArrayList<ArrayList<String>> pokemonList = new ArrayList<ArrayList<String>>();

        try {
            File XMLFile = new File("src/main/resources/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(XMLFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Pokemon");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                ArrayList<String> onePokemon = new ArrayList<String>();

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    eElement.getAttribute("name");

                    String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
                    String fire = eElement.getElementsByTagName("Fire").item(0).getTextContent();
                    String water = eElement.getElementsByTagName("Water").item(0).getTextContent();
                    String leaf = eElement.getElementsByTagName("Leaf").item(0).getTextContent();
                    String electric = eElement.getElementsByTagName("Electric").item(0).getTextContent();

                    onePokemon.add(name);
                    onePokemon.add(fire);
                    onePokemon.add(water);
                    onePokemon.add(leaf);
                    onePokemon.add(electric);

                    pokemonList.add(onePokemon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemonList;
    }
}
