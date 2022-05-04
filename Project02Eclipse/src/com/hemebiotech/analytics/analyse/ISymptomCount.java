package com.hemebiotech.analytics.analyse;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * allows you to count the occurrences and keep only one of each
 */
public interface ISymptomCount {
    /**
     *
     * @return countSymptom for count different symptoms
     */
    TreeMap<String, Integer> countSymptom(ArrayList<String> symptoms);
}
