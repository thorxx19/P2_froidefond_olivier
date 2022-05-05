package com.hemebiotech.analytics.analyse;

import java.util.ArrayList;
import java.util.TreeMap;

public interface ISymptomsCount {
    TreeMap<String, Integer> countSymptom(ArrayList<String> symptoms);
}
