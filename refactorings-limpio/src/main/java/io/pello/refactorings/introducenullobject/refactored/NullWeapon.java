/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.pello.refactorings.introducenullobject.refactored;

/**
 *
 * @author danie
 */
public class NullWeapon extends Weapon {

    public NullWeapon(int damage) {
        super(damage);
    }

    @Override
    public int getDamage() {
        return 0;
    }
}
