package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        this.health = 100;
        this.physDef = 50;
        this.magicDef = 20;
        this.physAtt = 15;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }


    @Override
    public void healHimself() {
        if (health < 75) {
            health += 25;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health < 90) {
            hero.health += 10;
        } else {
            hero.health = 100;
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
