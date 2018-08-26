package jerre.structural.decorator;

public class BowEnemy implements Enemy {

    private Enemy enemy;

    public BowEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void fight() {
        enemy.fight();
        System.out.println("Firing arrow, pew pew");
    }
}
