package com.hemebiotech.analytics.write;


import java.io.FileWriter;
import java.util.Map;

/**
 * classe write
 *
 * @author O.froidefond
 */

public class WriteSymptomsDataFromMap {

   final static StringBuilder line = new StringBuilder();

    /**
     * construct
     */
    public WriteSymptomsDataFromMap() {
    }

    /**
     * fonction write symptoms
     *
     * @param map is array symptom sort and count
     * fonction write the new file result.out
     */
    public void writeSymptom(Map<String,Integer> map){
        try {

            for (Map.Entry<String,Integer> entry: map.entrySet()) {
                line.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
            }
            // writes symptoms in new result.out file
            FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result/result.out");
            writer.write(String.valueOf(line));
            writer.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
