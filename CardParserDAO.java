package com.michal.oop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public interface CardParserDAO {
    public ArrayList<String> readFileToList(String fileName) throws FileNotFoundException;
    public List<List<String>> readFileTo2DList(String fileName) throws IOException;
    public List<String> separateStringToList(int index) throws IOException;
    public String getName(int index) throws IOException;
    public String getFire(int index) throws IOException;
    public String getWater(int index) throws IOException;
    public String getLeaf(int index) throws IOException;
    
    
}