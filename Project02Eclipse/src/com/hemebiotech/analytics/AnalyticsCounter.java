package com.hemebiotech.analytics;


import com.hemebiotech.analytics.reader.ReadSymptomsDataFromFile;
import com.hemebiotech.analytics.count.CountSymptomsDataFromMap;
import com.hemebiotech.analytics.sort.SortSymptomsDataFromArray;
import com.hemebiotech.analytics.write.WriteSymptomsDataFromMap;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * class principal
 *
 * @author o.froidefond
 *
 */

public class AnalyticsCounter {
	/**
	 * construct
	 */
	public AnalyticsCounter() {
	}

	/**
	 * fonction main
	 *
	 * @param args arg
	 */
	public static void main(String[] args){

		try {
			ReadSymptomsDataFromFile readSymptomDataFromFile = new ReadSymptomsDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/resources/symptoms.txt");
			SortSymptomsDataFromArray sortSymptomsDataFromArray = new SortSymptomsDataFromArray();
			CountSymptomsDataFromMap countSymptomsDataFromMap = new CountSymptomsDataFromMap();
			WriteSymptomsDataFromMap writeSymptomDataFromMap = new WriteSymptomsDataFromMap();

			//read symptoms.txt
			ArrayList<String> listSymptomsRaw = (ArrayList<String>) readSymptomDataFromFile.getSymptoms();

			//sort sympoms in ArrayList listSymptoms
			ArrayList<String> listSymptomsSort = sortSymptomsDataFromArray.sortSymptoms(listSymptomsRaw);

			//count symptom
			TreeMap<String,Integer> mapSymptomCount = countSymptomsDataFromMap.countSymptom(listSymptomsSort);

			//write symptom
			writeSymptomDataFromMap.writeSymptom(mapSymptomCount);


		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
