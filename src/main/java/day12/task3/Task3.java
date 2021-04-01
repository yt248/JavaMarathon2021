package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список,
состоящий из групп, основанных после 2000 года.
Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).

 */
public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(new MusicBand("Green Day", 1987));
        bandList.add(new MusicBand("Nirvana", 1991));
        bandList.add(new MusicBand("New Order ", 1991));
        bandList.add(new MusicBand("Offspring", 1994));
        bandList.add(new MusicBand("My Chemical Romance", 2001));
        bandList.add(new MusicBand("The Killers", 2001));
        bandList.add(new MusicBand("Arctic Monkeys", 2002));
        bandList.add(new MusicBand("Franz Ferdinand", 2002));
        bandList.add(new MusicBand("All Time Low", 2003));
        bandList.add(new MusicBand("Alter Bridge", 2004));
        Collections.shuffle(bandList);
        System.out.println(bandList);
        System.out.println();
        System.out.println(groupsAfter2000(bandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() < 2000) {
                bands.remove(i);
            }
        }
        return bands;
    }
}
