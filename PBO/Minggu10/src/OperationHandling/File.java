package OperationHandling;

import java.util.*;
import java.io.*;


public class File {
   public static void main(String[] args){  
        
        String fileName = "src/File.txt" ; 
        
        // ReadFile
        File inputFile = new File(fileName);
        Scanner fileReader = new Scanner(inputFile);
        
        // Cetak ke layar
        while(fileReader.hasNextLine()){
        String data = fileReader.nextLine();
        System.out.println(data);
        }  
        FileReader.close();      
    }
}
