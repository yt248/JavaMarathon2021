package day5;

/*
1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(2001);
        car.setColor("Red");
        car.setModel("Audi");
        System.out.println("Модель: " + car.getModel() + ", Год - " + car.getAge() + ", Цвет - " + car.getColor());
    }
}
