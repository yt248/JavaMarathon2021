package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
2. Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.

Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
 Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.

 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String pathFile1 = "file1.txt";
        String pathFile2 = "file2.txt";
        File file1 = new File(pathFile1);
        File file2 = new File(pathFile2);

        PrintWriter pw1 = new PrintWriter(pathFile1);
        PrintWriter pw2 = new PrintWriter(pathFile2);
        Random random = new Random();
        double counter;

        for (int i = 0; i < 1000; i++)
            pw1.println(random.nextInt(100));

        pw1.close();
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            counter = 0;
            for (int i = 0; i < 20; i++) {
                counter += Double.parseDouble(scanner.nextLine());
            }
            pw2.println(counter / 20);
        }
        pw2.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sumAll = 0;
        while (scanner.hasNextLine()) {
            sumAll += Double.parseDouble(scanner.nextLine());
        }
        System.out.println(sumAll);
        System.out.println((int) sumAll);

    }
}
