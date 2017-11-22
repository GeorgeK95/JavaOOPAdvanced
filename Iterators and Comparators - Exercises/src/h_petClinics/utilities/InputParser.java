package h_petClinics.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class InputParser {
    private static final String DELIMITER = "\\s+";

    public InputParser() {
    }

    public List<String> parseInput(String inputLine) {
        return new ArrayList<>(Arrays.asList(inputLine.split(DELIMITER)));
    }

    public String[] parseInputAsArray(String inputLine) {
        return inputLine.split(DELIMITER);
    }
}
