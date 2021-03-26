package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String predmet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int x = random.nextInt(4) + 1;
        String ocenka;
        if (x == 2) {
            ocenka = "неудовлетворительно";
        } else if (x == 3) {
            ocenka = "удовлетворительно";
        } else if (x == 4) {
            ocenka = "хорошо";
        } else {
            ocenka = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.predmet + " на оценку " + ocenka);
    }
}
