package day6;

/*
1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
В классах Автомобиль и Мотоцикл реализуйте два метода:
void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
и возвращает разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).

В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

 */
public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2010);
        Car car2 = new Car();
        car2.setYear(2010);
        Motorbike motorbike1 = new Motorbike(2000, "Green", "Honda");
        Motorbike motorbike2 = new Motorbike(2000, "Blue", "Java");

        // Car Test
        car1.info();
        System.out.println(car1.yearDifference(2020));
        car2.info();
        System.out.println(car2.yearDifference(1990));

        // Motorbike Test
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2010));
        motorbike2.info();
        System.out.println(motorbike2.yearDifference(1980));
    }
}
