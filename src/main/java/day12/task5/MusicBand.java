package day12.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }

    public void setMusicArtists(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void printMembers() {
        System.out.println(musicArtists);
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (int i = 0; i < a.musicArtists.size(); i++) {
            b.musicArtists.add(a.musicArtists.get(i));
        }
    }
}

