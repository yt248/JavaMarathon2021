package day11.task2;

public class Magician extends Hero implements  MagicAttack {
    private int magicAtt; //(величина магической атаки)

    public Magician() {
        this.health = 100;
        this.physDef = 0;
        this.magicDef = 80;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int health = hero.getHealth();

        health -= this.magicAtt - (this.magicAtt * hero.magicDef / 100);
        if (health > 0) {
            hero.setHealth(health);
        } else {
            hero.setHealth(0);
        }
    }


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
