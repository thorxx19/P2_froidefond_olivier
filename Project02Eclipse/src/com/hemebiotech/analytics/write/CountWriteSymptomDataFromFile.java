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
            StringBuilder sympton = new StringBuilder();
            ArrayList<String> newList = new ArrayList<>();
            Map<String,Integer> map = new HashMap<>();

            //search for identical occurrences and their number to write it only once in the file result.out


                for (String sym: countSymptom) {
                    map.putIfAbsent(sym,0);
                    map.put(sym,map.get(sym)+1);
                }
                for (Map.Entry<String,Integer> entry: map.entrySet()) {
                    newList.add(entry.getKey()+"="+entry.getValue());
                }
            String[] tabSymptoms1 = newList.toArray(new String[0]);

            // sort occurences alphabetically
            Arrays.sort(tabSymptoms1);

            for (Object symFin1:tabSymptoms1) {
                sympton.append(symFin1).append("\n");
            }


            // writes symptoms and count occurences in new result.out file
            FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result/result.out");
            writer.write(String.valueOf(sympton));
            writer.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
