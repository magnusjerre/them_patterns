package jerre.structural.decorator;

public class Orc implements Enemy {

    private Enemy enemy;
    private String name;

    public Orc(String name, Enemy enemy) {
        this.name = name;
        this.enemy = enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void fight() {
        System.out.println("I'm " + name);
        enemy.fight();
    }
}
