package com.hemebiotech.analytics.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *class for method getSymptoms
 *
 * @author o.froidefond
 * class which parses the file enter @param line by line
 * Simple brute force implementation
 */

public class ReadSymptomsDataFromFile implements ISymptomReader {
	private final String filepath;

	/**
	 * construct
	 *
	* @param filepath a full or partial path to file with symptom strings in it, one per line
	*/
	public ReadSymptomsDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * method
	 *
	 * @return string array of symptoms read from the file symptoms
	 */
	@Override
	public List<String> getSymptoms() {

		ArrayList<String> result = new ArrayList<String>();
		//line-by-line reading of the file and integration in the array result
		if (filepath != null) {
			try {

				File file = new File(filepath);
				Scanner scanner = new Scanner(file);

				while (scanner.hasNextLine()){
					result.add(scanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println("file not found Exception");
			}
		}
		return result;
	}
}
