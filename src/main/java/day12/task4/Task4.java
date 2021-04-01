package day12.task4;

import java.util.ArrayList;
import java.util.List;

/*
4.  *Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять участников.
 Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп (в классе MusicBand),
 т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
 Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
 В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(),
 возвращающий список участников.
Проверить состав групп после слияния.

 */
public class Task4 {
    public static void main(String[] args) {
        MusicBand a = new MusicBand("Green Day", 1987);
        MusicBand b = new MusicBand("Nirvana", 1991);

        List<String> groupMembers = new ArrayList<>();
        groupMembers.add("Билли Джо Армстронга");
        groupMembers.add("Майка Дёрнта");
        groupMembers.add("Тре Кула");

        a.setGroupMembers(groupMembers);
        MusicBand.transferMembers(a, b);

        a.printMembers();

        b.printMembers();

    }
}
