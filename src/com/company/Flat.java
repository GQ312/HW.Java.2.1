package com.company;

public final class Flat extends Home{
    private int numFlat;
    private int numFloor;
    private Position position;

    public Flat(int numHome, int sumFlat, int numFlat, int numFloor, Position position) {
        super(numHome, sumFlat);
        this.numFlat = numFlat;
        this.numFloor = numFloor;
        this.position = position;
    }

    public int getNumFlat() {
        return numFlat;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public Position getPosition() {
        return position;
    }

    public String getInfo() {
        return "Number of flat: " + numFlat + "/Number of floor: " + numFloor + "/Position of the flat: " + position;
    }

    @Override
    public void taxHome(int sumFlat) {
        System.out.println("Method is override!");
    }
}
