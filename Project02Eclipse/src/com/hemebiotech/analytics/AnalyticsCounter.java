package com.hemebiotech.analytics;


import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.CountWriteSymptomDataFromFile;

import java.util.ArrayList;

/**
 * @author o.froidefond
 *
 */

public class AnalyticsCounter {

	public static void main(String args[]){


		try {
			ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/resources/symptoms.txt");
			CountWriteSymptomDataFromFile countSymptomDataFromFile = new CountWriteSymptomDataFromFile();

			//read symptoms.txt
			ArrayList<String> listeSymptom = (ArrayList<String>) readSymptomDataFromFile.GetSymptoms();

			//count symptome and write in result.out
			countSymptomDataFromFile.CountWriteSymptom(listeSymptom);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
