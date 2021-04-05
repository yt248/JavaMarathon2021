package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
1. Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из задания 1 дня 14) и
 в качестве ответа выводит в консоль среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа
(со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).

Детали реализации: В классе Task1 создать публичный статический метод printResult(File file),
в котором реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file),
передав ему в качестве аргумента объект класса File (txt файл с целыми числами).

Пример:
Числа в txt файле: 5 2 8 34 1 36 77
Ответ: 23.285714285714285 --> 23.286

 */
public class Task1 {
    public static void main(String[] args) {
        String path = "task1Day14.txt";
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            double allSum = 0;
            int counter = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                allSum += Integer.parseInt(scanner.nextLine());
                counter++;
            }

            String formattedDouble = String.format("%.3f", allSum / counter);
            System.out.println("Ответ: " + allSum / counter + " --> " + formattedDouble);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

