package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int physAtt; //(величина физической атаки)
    private int magicAtt; //(величина магической атаки)

    public Shaman() {
        super(100, 20, 20);
        this.physAtt = 10;
        this.magicAtt = 15;
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
    public void healHimself() {
        if (health < 50) {
            health += 50;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health < 70) {
            hero.health += 30;
        } else {
            hero.health = 100;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
