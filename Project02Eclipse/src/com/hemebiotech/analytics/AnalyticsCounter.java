package com.hemebiotech.analytics;

import com.hemebiotech.analytics.analyse.classe.CountSymptomsDataFromFile;
import com.hemebiotech.analytics.analyse.classe.ReadSymptomsDataFromFile;
import com.hemebiotech.analytics.analyse.classe.SortSymptomsDataFromFile;
import com.hemebiotech.analytics.analyse.classe.WriteSymptomsDataFromFile;

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
            ReadSymptomsDataFromFile readSymptomsDataFromFile = new ReadSymptomsDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/resources/symptoms.txt");
            SortSymptomsDataFromFile sortSymptomsDataFromFile = new SortSymptomsDataFromFile();
            CountSymptomsDataFromFile countSymptomsDataFromFile = new CountSymptomsDataFromFile();
            WriteSymptomsDataFromFile writeSymptomsDataFromFile = new WriteSymptomsDataFromFile();


            //read symptoms.txt
            ArrayList<String> listSymptomsRaw = readSymptomsDataFromFile.getSymptoms();
            //sort sympoms in ArrayList listSymptoms
            ArrayList<String> listSymptomsSort = sortSymptomsDataFromFile.sortSymptoms(listSymptomsRaw);
            //count symptom
            TreeMap<String, Integer> mapSymptomCount = countSymptomsDataFromFile.countSymptom(listSymptomsSort);
            //write symptom
            writeSymptomsDataFromFile.writeSymptom(mapSymptomCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
