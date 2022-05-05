package com.hemebiotech.analytics.analyse.classe;

import com.hemebiotech.analytics.analyse.ISymptomsWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class WriteSymptomsDataFromFile implements ISymptomsWriter {

    public WriteSymptomsDataFromFile() {
    }


    /**
     * method (writeSymptoms) write symptoms in file result.out
     *
     * @param map is array symptom sort and count
     *            fonction write the new file result.out
     * @return filresult
     */
    @Override
    public File writeSymptom(Map<String, Integer> map) {
        final StringBuilder line = new StringBuilder();
        File fileResult = new File("Project02Eclipse/src/com/hemebiotech/analytics/result/result.out");
        try {

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                line.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
            }
            // writes symptoms in new result.out file
            FileWriter writer = new FileWriter(fileResult);
            writer.write(String.valueOf(line));
            writer.close();

            return fileResult;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
