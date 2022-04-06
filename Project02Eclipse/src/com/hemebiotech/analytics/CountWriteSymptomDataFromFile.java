package com.hemebiotech.analytics;


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

    public void CountWriteSymptom(List<String> countSymptom){

        String[] tabSymptoms = countSymptom.toArray(new String[0]);
        // sort occurences alphabetically
        Arrays.sort(tabSymptoms);
        //occurrence counters
        int count = 0;

        try {
            StringBuilder sympton = new StringBuilder();
            //search for identical occurrences and their number to write it only once in the file result.out
            for (int i=0; i< tabSymptoms.length-1 ;i++){
                if (tabSymptoms[i].equals(tabSymptoms[i+1])) {
                    count++;
                }else{
                    count++;
                    sympton.append(tabSymptoms[i]).append("=").append(count).append("\n");
                    count = 0;
                }
                if (!tabSymptoms[tabSymptoms.length-2].equals(tabSymptoms[tabSymptoms.length-1]) && i == tabSymptoms.length-2){
                    count++;
                    sympton.append(tabSymptoms[tabSymptoms.length-1]).append("=").append(count).append("\n");
                    count = 0;
                }
            }
            // writes symptoms and count occurences in new result.out file
            FileWriter writer = new FileWriter("result.out");
            writer.write(String.valueOf(sympton));
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
