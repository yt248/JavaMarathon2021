package day11.task2;

public abstract class Hero implements PhysAttack {
    public int health; //(здоровье)
    public int physDef; //(процент поглощения физического урона)
    public int magicDef; //(процент поглощения магического урона)
    public int physAtt; //(величина физической атаки)

    public Hero() {
        this.health = 0;
        this.physDef = 0;
        this.magicDef = 0;
        this.physAtt = 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }


    public void physicalAttack(Hero hero) {
        int health = hero.getHealth();
        health -= this.physAtt - (this.physAtt * hero.physDef / 100);
        if (health > 0) {
            hero.setHealth(health);
        } else {
            hero.setHealth(0);
        }

    }


}
