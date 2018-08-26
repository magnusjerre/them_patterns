package jerre.structural.decorator;

public class AxeEnemy implements Enemy {

    private Enemy enemy;

    public AxeEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void fight() {
        enemy.fight();
        System.out.println("Swining axe, woosh woosh");
    }
}
