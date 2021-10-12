package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here
        TrainingBO readInput = new TrainingBO();
        readInput.readFile();

        Training tr = new Training();
        readInput.getProcessedString(tr);

        readInput.writeFile(readInput.getProcessedString(tr));
    }
}
