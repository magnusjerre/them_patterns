package jerre.structural.decorator;

public class EnemyLeader implements Enemy {

    private Enemy enemy;

    public EnemyLeader(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void fight() {
        System.out.println("Leader commanding");
        enemy.fight();
    }
}
