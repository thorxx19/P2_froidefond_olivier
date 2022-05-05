package com.hemebiotech.analytics.analyse;

import java.io.File;
import java.util.Map;

public interface ISymptomsWriter {
    File writeSymptom(Map<String, Integer> map);
}
