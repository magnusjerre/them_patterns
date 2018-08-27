package jerre.structural.decorator;

public class BaseEnemy implements Enemy {
    @Override
    public void fight() {
        System.out.println("Obeying for the fight");
    }
}
