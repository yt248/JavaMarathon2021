package day4;

import java.util.Arrays;
import java.util.Random;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int maxArr = Integer.MIN_VALUE;
        int minArr = Integer.MAX_VALUE;
        int quantityElementsEqualsZero = 0;
        int sumElementsEqualsZero = 0;

        for (int arr : array) {
            if (arr % 10 == 0) {
                quantityElementsEqualsZero++;
                sumElementsEqualsZero += arr;
            }
            if (minArr > arr) {
                minArr = arr;
            }
            if (maxArr < arr) {
                maxArr = arr;
            }

        }

//        System.out.println(Arrays.toString(array));
        System.out.println("наименьший элемент массива: " + minArr);
        System.out.println("наибольший элемент массива: " + maxArr);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + quantityElementsEqualsZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumElementsEqualsZero);
    }
}
