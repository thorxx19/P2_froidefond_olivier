package com.hemebiotech.analytics;


import java.util.List;

/**
 * @author o.froidefond
 *
 */

public class AnalyticsCounter {

	public static void main(String args[]){
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		CountWriteSymptomDataFromFile countSymptomDataFromFile = new CountWriteSymptomDataFromFile();

		//read symptoms.txt
		List<String> listeSymptom = readSymptomDataFromFile.GetSymptoms();

		//count symptome and write in result.out
		countSymptomDataFromFile.CountWriteSymptom(listeSymptom);


	}
}
