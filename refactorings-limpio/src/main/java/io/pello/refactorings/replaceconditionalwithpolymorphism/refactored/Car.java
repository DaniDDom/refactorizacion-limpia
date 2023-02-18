/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored;

public class Car extends Vehicle {

    public Car(int vehicleType, int speed, int acceleration) {
        super(vehicleType, speed, acceleration);
    }

    @Override
    public int move() {
        return speed * acceleration * 5;
    }
}
