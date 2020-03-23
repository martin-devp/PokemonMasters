package com.michal.oop;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Main{
	CardParserDAO parser = new CardParserImpl();
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		GameModes newGameMode= new GameModes();
		newGameMode.PVP();

	}
}

		
		
		
		
		


