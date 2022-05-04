package com.hemebiotech.analytics.analyse;

import java.io.File;
import java.util.Map;

/**
 * allows you to write the sort and count symptoms in a new file
 */
public interface ISymptomWriter {
    /**
     *
     * @return filresult
     */
    public File writeSymptom(Map<String, Integer> map);
}
