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

    public void CountWriteSymptom(ArrayList<String> countSymptom){

        String[] tabSymptoms = countSymptom.toArray(new String[0]);
        ArrayList<String> newList = new ArrayList<>();
        // sort occurences alphabetically
        Arrays.sort(tabSymptoms);
        //occurrence counters


        try {
            StringBuilder sympton = new StringBuilder();
            String symTemp = "";
            int count = 0;
            //search for identical occurrences and their number to write it only once in the file result.out

            for (Object i: tabSymptoms) {

                if (!symTemp.isEmpty() && !newList.contains(i)){
                    sympton.append(symTemp).append("=").append(count).append("\n");
                    count =0;
                }
            if (newList.contains(i) && !symTemp.isEmpty()){
                if (countSymptom.contains(i)){
                    count++;
                }
            }else {
                symTemp = "";
                newList.add(String.valueOf(i));
                symTemp = String.valueOf(i);
                count++;
            }
        }
            sympton.append(symTemp).append("=").append(count).append("\n");

            // writes symptoms and count occurences in new result.out file
            FileWriter writer = new FileWriter("result.out");
            writer.write(String.valueOf(sympton));
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
