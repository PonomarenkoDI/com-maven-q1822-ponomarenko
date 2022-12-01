package com.maven.q1822.ponomarenko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface PropertiesReader {

   default void readPropertiesFile(){
       String line;
       try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\test.properties"));
           while ((line = bufferedReader.readLine()) != null) {
               String [] tempArr = line.split("=");
               System.setProperty(tempArr[0],tempArr[1]);

           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
