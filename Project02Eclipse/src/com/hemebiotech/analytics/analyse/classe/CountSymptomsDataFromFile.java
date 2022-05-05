package com.hemebiotech.analytics.analyse.classe;

import com.hemebiotech.analytics.analyse.ISymptomsCount;

import java.util.ArrayList;
import java.util.TreeMap;

public class CountSymptomsDataFromFile implements ISymptomsCount {
    public CountSymptomsDataFromFile() {
    }

    /**
     * method (countSymptoms) countSymptom for count different symptoms
     *
     * @param symptoms array with the symptoms retrieved in a .txt file
     * @return map is TreeMap count of different symptoms
     */
    @Override
    public TreeMap<String, Integer> countSymptom(ArrayList<String> symptoms) {
        final TreeMap<String, Integer> map = new TreeMap<>();
        try {
            //search for identical occurrences and their number to write it only once in the file result.out

            for (String symptom : symptoms) {
                map.putIfAbsent(symptom, 0);
                map.put(symptom, map.get(symptom) + 1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return map;
    }
}
