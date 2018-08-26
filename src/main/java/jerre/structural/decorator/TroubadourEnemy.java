package jerre.structural.decorator;

public class TroubadourEnemy implements Enemy{

    private Enemy enemy;

    public TroubadourEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void fight() {
        enemy.fight();
        System.out.println("Troubadouring! breet blurp!");
    }
}
