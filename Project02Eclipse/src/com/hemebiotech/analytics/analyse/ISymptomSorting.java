package com.hemebiotech.analytics.analyse;

import java.util.ArrayList;

/**
 * allows you to sort the different occurrences of the
 * array with all the occurrences
 */
public interface ISymptomSorting {
    /**
     *
     * @return listSymptomsSort is array sort of symptoms
     */
    ArrayList<String> sortSymptoms(ArrayList<String> symptoms);
}
