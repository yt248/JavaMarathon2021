package day7;


/*
1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes,
 который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.

 */
public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("British", 2015, 40, 15);
        Airplane airplane2 = new Airplane("British", 2015, 60, 15);
        Airplane airplane3 = new Airplane("British", 2015, 60, 15);
        Airplane.compareAirplanes(airplane1, airplane2);
        System.out.println();
        Airplane.compareAirplanes(airplane2, airplane3);
    }
}