package day12;

import java.util.ArrayList;
import java.util.List;

/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
Вывести список в консоль.

 */
public class Task1 {
    public static void main(String[] args) {
        List<String> listCarMark = new ArrayList<>();
        listCarMark.add("audi");
        listCarMark.add("bmw");
        listCarMark.add("mercedes");
        listCarMark.add("tesla");
        listCarMark.add("porsche");
        System.out.println(listCarMark);
        listCarMark.add(3,"volvo");
        listCarMark.remove(0);
        System.out.println(listCarMark);

    }
}
