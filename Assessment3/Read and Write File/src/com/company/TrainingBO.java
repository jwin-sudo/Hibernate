package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util. *;
import java.util.concurrent.TimeUnit;

public class TrainingBO {

    public Training readFile() throws FileNotFoundException, ParseException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        Scanner scanner = new Scanner(br);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

            String[] tokens = scanner.nextLine().split(",");
            Date firstDate = sdf.parse(tokens[1]);
            Date secondDate = sdf.parse(tokens[2]);
            Training tr = new Training(tokens[0],firstDate,secondDate,tokens[3], Integer.parseInt(tokens[4]));

            return tr;
    }

    public StringBuilder getProcessedString(Training training){
        long diffInMillies = Math.abs(training.endDate.getTime() - training.startDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

       return new StringBuilder("Training details\n" +
       "Training name:" + training.getName() +
       "\nStart Date:" + training.getStartDate() +
      "\nEnd Date:" + training.getEndDate() + "\nTraining duration:" + diff);

    }

    public void writeFile(StringBuilder data) throws IOException {
        File file = new File("output.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(data.toString());
        fw.close();
    }


}
