package io.pello.refactorings.pushdown.refactored;

public class Car extends Vehicle {

    private String trunk;
    private boolean isTrunkOpened;
    protected String plate;
    protected Insurance insurance;

    public void start() {
    }

    public boolean isTrunkOpen() {
        return isTrunkOpened;
    }

}
