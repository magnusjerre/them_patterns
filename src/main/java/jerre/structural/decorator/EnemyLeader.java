package jerre.structural.decorator;

public class EnemyLeader implements Enemy {

    public EnemyLeader() {
    }

    @Override
    public void fight() {
        System.out.println("Leader commanding lowly orcs");
    }
}
