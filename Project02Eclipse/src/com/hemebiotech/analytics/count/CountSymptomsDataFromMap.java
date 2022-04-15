package com.hemebiotech.analytics.count;




import java.util.ArrayList;
import java.util.TreeMap;

/**
 * class count symptoms
 *
 * @author O.froidefond
 * TreeMap counts different symptoms for new result.out file
 */
public class CountSymptomsDataFromMap{
   private final TreeMap<String,Integer> map = new TreeMap<>();

    /**
     * construct
     */
    public CountSymptomsDataFromMap() {
    }

    /**
     *function countSymptom
     *
     * @param symptoms array with the symptoms retrieved in a .txt file
     * @return map is TreeMap count of different symptoms
     */
    public TreeMap<String, Integer> countSymptom(ArrayList<String> symptoms){

        try {
            //search for identical occurrences and their number to write it only once in the file result.out

                for (String symptom: symptoms) {
                    map.putIfAbsent(symptom,0);
                    map.put(symptom,map.get(symptom)+1);
                }

            }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return map;
    }
}
