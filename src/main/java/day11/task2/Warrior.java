package day11.task2;

public class Warrior extends Hero {


    public Warrior() {
        this.health = 100;
        this.physDef = 80;
        this.magicDef = 0;
        this.physAtt = 30;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

}
