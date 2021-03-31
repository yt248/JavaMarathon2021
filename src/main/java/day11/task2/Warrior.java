package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt; //(величина физической атаки)


    public Warrior() {
        super(100, 80, 0);
        this.physAtt = 30;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
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
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
