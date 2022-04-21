	package com.hemebiotech.analytics.analyse;

	import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

	/**
	 *class for read, sort, count and write different symptoms
	 *
	 * @author o.froidefond
	 * class which parses the file enter @param line by line
	 * Simple brute force implementation
	 */

	public class AnalyseSymptomsDataFromFile implements ISymptomReader {
		private final String filepath;

		/**
		 * construct
		 *
		* @param filepath a full or partial path to file with symptom strings in it, one per line
		*/
		public AnalyseSymptomsDataFromFile(String filepath) {
			this.filepath = filepath;
		}

	/**
	 * method (getSymptoms) for read symptom in file
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

	/**
	 * method (sortSymptoms) sort the symptoms in alphabetical order
	 *
	 * @param symptoms is raw array list of symptoms
	 * @return listSymptomsSort is array sort of symptoms
	 *
	 */
	public ArrayList<String> sortSymptoms(ArrayList<String> symptoms) {
		ArrayList<String> listSymptomsSort = new ArrayList<>();

		try {

			symptoms.sort(String::compareTo);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return symptoms;
	}

	/**
	 *method (countSymptoms) countSymptom for count different symptoms
	 *
	 * @param symptoms array with the symptoms retrieved in a .txt file
	 * @return map is TreeMap count of different symptoms
	 */
	public TreeMap<String, Integer> countSymptom(ArrayList<String> symptoms){
		 final TreeMap<String,Integer> map = new TreeMap<>();
		try {
			//search for identical occurrences and their number to write it only once in the file result.out

			for (String symptom: symptoms) {
				map.putIfAbsent(symptom,0);
				map.put(symptom,map.get(symptom)+1);
			}

		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return map;
	}

	/**
	 * method (writeSymptoms) write symptoms in file result.out
	 *
	 * @param map is array symptom sort and count
	 * fonction write the new file result.out
	 */
	public void writeSymptom(Map<String,Integer> map){
		final StringBuilder line = new StringBuilder();

		try {

			for (Map.Entry<String,Integer> entry: map.entrySet()) {
				line.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
			}
			// writes symptoms in new result.out file
			FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result/result.out");
			writer.write(String.valueOf(line));
			writer.close();

		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
