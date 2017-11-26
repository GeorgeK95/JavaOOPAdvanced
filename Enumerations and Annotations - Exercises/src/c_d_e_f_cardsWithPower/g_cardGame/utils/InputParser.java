package c_d_e_f_cardsWithPower.g_cardGame.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputParser {

    public InputParser() {
    }

    public List<String> parseInput(String inputLine) {
        return new ArrayList<>(Arrays.asList(inputLine.split(Constants.SPLIT_STRING)));
    }

    public String[] parseInputAsArray(String inputLine) {
        return inputLine.split(Constants.SPLIT_STRING);
    }

}