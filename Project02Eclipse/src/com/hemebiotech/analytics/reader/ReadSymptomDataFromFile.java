package com.hemebiotech.analytics.reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simple brute force implementation
 *
 */

public class ReadSymptomDataFromFile implements ISymptomReader {
	private final String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @return returns a string array of symptoms read from the file symptoms
	 * @author O.froidefond
	 * class which parses the file enter @param line by line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
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
