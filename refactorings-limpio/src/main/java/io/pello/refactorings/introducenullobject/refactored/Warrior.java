package io.pello.refactorings.introducenullobject.refactored;

public class Warrior {

    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {

        return 2 + weapon.getDamage();

    }
}
