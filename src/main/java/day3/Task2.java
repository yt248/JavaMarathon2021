package day3;

import java.util.Scanner;

/*
2. Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
 Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
 Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
В решении обязательно использовать оператор break.

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();
            if (divider == 0){
                break;
            } else {
                System.out.println(dividend / divider);
            }
        }


    }
}
