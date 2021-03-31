package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt; //(величина физической атаки)

    public Paladin() {
        super(100, 50, 20);
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
    public void physicalAttack(Hero hero) {
        int health = hero.getHealth();

        health -= this.physAtt - (this.physAtt * hero.physDef / 100);
        if (health > 0) {
            hero.setHealth(health);
        } else {
            hero.setHealth(0);
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
