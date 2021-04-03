package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами.
Реализовать статический метод printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
Вызвать данный метод в методе main().

 */
public class Task1 {
    public static void main(String[] args) {
        String path = "task1Day14.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int counter = 0;
            for (int i = 0; i < 10; i++) {
                counter += scanner.nextInt();
            }
            System.out.println(counter);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NoSuchElementException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
