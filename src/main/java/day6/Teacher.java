package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subjectName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher(String name, String subjectName) {
        this.name = name;
        this.subjectName = subjectName;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int x = random.nextInt(4) + 2;
        String rating;
        if (x == 2) {
            rating = "неудовлетворительно";
        } else if (x == 3) {
            rating = "удовлетворительно";
        } else if (x == 4) {
            rating = "хорошо";
        } else {
            rating = "отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subjectName + " на оценку " + rating);
    }
}
