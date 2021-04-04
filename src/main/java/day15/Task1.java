package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src/main/resources/shoes.csv";
        String missing_shoes = "src/main/resources/missing_shoes.txt";


        File file = new File(path);
        String[] newSplitLine = new String[0];
        try {
            PrintWriter pw = new PrintWriter(missing_shoes);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(";");
                for (int i = 0; i < splitLine.length; i++) {
                    if (Integer.parseInt(splitLine[i += 2]) == 0) {
                        for (int j = i - 2; j < 3; j++) {
                            if (j < 2) {
                                pw.print(splitLine[j]);
                                pw.print(", ");
                            } else {
                                pw.print(splitLine[j]);
                                pw.println();
                            }
                        }
                    }
                }
            }

            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

