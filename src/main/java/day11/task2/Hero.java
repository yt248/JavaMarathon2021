package day11.task2;

public abstract class Hero {
    public int health; //(здоровье)
    public int physDef; //(процент поглощения физического урона)
    public int magicDef; //(процент поглощения магического урона)

    public Hero(int health, int physDef, int magicDef) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
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
}
