package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
 Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.toIntExact((Math.round(Math.random() * 10)));
            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));

        int numbersMoreEight = 0;
        int numbersEqualsOne = 0;
        int quantityOddNumbers = 0;
        int quantityEvenNumbers = 0;
        int sumAllNumbersArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                numbersMoreEight++;
            } else if (array[i] == 1) {
                numbersEqualsOne++;
            } else if (array[i] % 2 == 0) {
                quantityOddNumbers++;
            } else if (array[i] % 2 != 0) {
                quantityEvenNumbers++;
            }

            sumAllNumbersArray += i;

        }

        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длинна массива:" + array.length);
        System.out.println("Количество чисел больше 8:" + numbersMoreEight);
        System.out.println("Количество чисел равных 1:" + numbersEqualsOne);
        System.out.println("Количество четных чисел:" + quantityOddNumbers);
        System.out.println("Количество нечетных чисел:" + quantityEvenNumbers);
        System.out.println("Сумма всех элементов массива:" + sumAllNumbersArray);


    }
}
