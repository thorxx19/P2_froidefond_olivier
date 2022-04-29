package com.hemebiotech.analytics;

import com.hemebiotech.analytics.analyse.AnalyseSymptomsDataFromFile;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * class principal
 *
 * @author o.froidefond
 */
public class AnalyticsCounter {
    /**
     * construct basic
     */
    public AnalyticsCounter() {
    }

    /**
     * fonction main
     *
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            AnalyseSymptomsDataFromFile analyseSymptomsDataFromFile = new AnalyseSymptomsDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/resources/symptoms.txt");
            //read symptoms.txt
            ArrayList<String> listSymptomsRaw = (ArrayList<String>) analyseSymptomsDataFromFile.getSymptoms();
            //sort sympoms in ArrayList listSymptoms
            ArrayList<String> listSymptomsSort = analyseSymptomsDataFromFile.sortSymptoms(listSymptomsRaw);
            //count symptom
            TreeMap<String, Integer> mapSymptomCount = analyseSymptomsDataFromFile.countSymptom(listSymptomsSort);
            //write symptom
            analyseSymptomsDataFromFile.writeSymptom(mapSymptomCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
