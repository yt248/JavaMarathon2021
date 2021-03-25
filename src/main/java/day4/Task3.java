package day4;

import java.util.Arrays;
import java.util.Random;

/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        int indexMax = 0;
        int sumSt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) Math.round(Math.random() * 3);
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
//                System.out.print(Arrays.toString(array) + " ");
            }
            if(sumSt <= sum){
                sumSt = sum;
                indexMax = i;
            }

            System.out.println("- " + sum);
        }
        System.out.println("Индекс строки " + indexMax);

        System.out.println();
        System.out.println(Arrays.toString(array));

    }
}
