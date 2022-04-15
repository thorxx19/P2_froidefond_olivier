package com.hemebiotech.analytics.sort;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * classe sort symptoms
 *
 * @author O.froidefond
 */


public class SortSymptomsDataFromArray {
    /**
     * construct
     */
    public SortSymptomsDataFromArray() {
    }

    /**
     * sort the symptoms in alphabetical order
     *
     * @param symptoms is raw array list of symptoms
     * @return listSymptomsSort is array sort of symptoms
     *
     */

    public ArrayList<String> sortSymptoms(ArrayList<String> symptoms) {
        ArrayList<String> listSymptomsSort = new ArrayList<>();

        try {
            listSymptomsSort = new ArrayList<>();
            String[] tabSymptoms = symptoms.toArray(new String[0]);
            Arrays.sort(tabSymptoms);

            Collections.addAll(listSymptomsSort, tabSymptoms);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listSymptomsSort;
    }
}
