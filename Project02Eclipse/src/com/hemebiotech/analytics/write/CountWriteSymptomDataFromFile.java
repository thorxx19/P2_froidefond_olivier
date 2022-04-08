package com.hemebiotech.analytics.write;


import lombok.Data;
import java.io.FileWriter;
import java.util.*;

@Data
public class CountWriteSymptomDataFromFile {

    /**
     * @Author O.froidefond
     * @param countSymptom array with the symtoms retrieved in a .txt file
     * class class sorts occurrences alphabetically and counts then writes a new result.out file
     */

    public void CountWriteSymptom(ArrayList<String> countSymptom){

        try {
            StringBuilder line = new StringBuilder();
            TreeMap<String,Integer> map = new TreeMap<>();

            //search for identical occurrences and their number to write it only once in the file result.out


                for (String symptom: countSymptom) {
                    map.putIfAbsent(symptom,0);
                    map.put(symptom,map.get(symptom)+1);
                }
                for (Map.Entry<String,Integer> entry: map.entrySet()) {
                    line.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
                }

            // writes symptoms and count occurences in new result.out file
            FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result/result.out");
            writer.write(String.valueOf(line));
            writer.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
