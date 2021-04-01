package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMembers = new ArrayList<>();

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

    public List<String> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<String> groupMembers) {
        this.groupMembers = groupMembers;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void printMembers() {
        System.out.println(groupMembers);
    }

    public List<String> getMembers() {
        return groupMembers;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.groupMembers.addAll(0, a.getGroupMembers());
//        for (int i = 0;i < a.groupMembers.size(); i++){
//            b.groupMembers.add(a.groupMembers.get(i));
//        }
    }
}

