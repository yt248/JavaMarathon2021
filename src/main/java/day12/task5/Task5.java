package day12.task5;


import java.util.ArrayList;
import java.util.List;

/*
5. *Выполнять в подпапке task5 в day12*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя, но и возраст.
 Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
 чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое,
 что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
 Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.


 */
public class Task5 {
    public static void main(String[] args) {


            MusicBand a = new MusicBand("Green Day", 1987);
            MusicBand b = new MusicBand("Nirvana", 1991);

            List<MusicArtist> musicArtists = new ArrayList<>();
            musicArtists.add(new MusicArtist("Билли Джо Армстронга", 1967));
            musicArtists.add(new MusicArtist("Майка Дёрнта", 1965));
            musicArtists.add(new MusicArtist("Тре Кула", 1960));

            a.setMusicArtists(musicArtists);

            MusicBand.transferMembers(a, b);

            a.printMembers();

            b.printMembers();

    }
}
