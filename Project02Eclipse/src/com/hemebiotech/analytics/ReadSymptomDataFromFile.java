package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
		List<String> result = new ArrayList<String>();
		//line-by-line reading of the file and integration in the array result
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
