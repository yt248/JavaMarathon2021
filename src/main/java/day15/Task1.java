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
        try {
            PrintWriter pw = new PrintWriter(missing_shoes);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(";");
                if (Integer.parseInt(splitLine[2]) == 0) {
                    pw.println(String.format("%s, %d, %d", splitLine[0], Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2])));
                }
            }

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

