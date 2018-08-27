package jerre.structural.decorator;

public class Main {

    public static void main(String... args) {
        BaseEnemy baseEnemy = new BaseEnemy();
        AxeEnemy axeEnemy = new AxeEnemy(baseEnemy);
        BowEnemy bowEnemy = new BowEnemy(baseEnemy);
        TroubadourEnemy troubadourEnemy = new TroubadourEnemy(baseEnemy);
        EnemyLeader leader = new EnemyLeader();
        Orc orc1 = new Orc("Bolg", leader);
        Orc orc2 = new Orc("Gorbag", bowEnemy);


        orc1.fight();
        System.out.println();
        orc2.fight();
        System.out.println();
        // Orc 1 is a sucky leader, demote to being a troubadour
        orc1.changeEnemyType(troubadourEnemy);
        orc1.fight();

    }
}
