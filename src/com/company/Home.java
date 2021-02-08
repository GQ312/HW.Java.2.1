package com.company;

public class Home extends District{
    private int numHome;
    private int sumFlat;
    private Level level;

    public Home(int numHome, int sumFlat, Level level) {
        this.numHome = numHome;
        this.sumFlat = sumFlat;
        this.level = level;
    }

    public Home(int numHome, int sumFlat) {
        super();
    }

    public int getNumHome() {
        return numHome;
    }

    public int getSumFlat() {
        return sumFlat;
    }

    public Level getLevel() {
        return level;
    }

    public void taxHome(int sumFlat) {
        System.out.println("Tax :" + sumFlat * 5);
    }
    public void taxHome(int sumFlat, int numHome) {
        if (numHome > 5) {
            System.out.println("Tax: " + sumFlat * 5);
        } else {
            System.out.println("Tax: " + sumFlat * 7);
        }
    }
    final public void taxHome(int sumFlat, Level level) {
        if (level == Level.ELEVEN) {
            System.out.println("Tax is out!");
        } else {
            System.out.println("There is a tax!");
        }
    }

    public String getInfo() {
        return "Number of home: " + numHome + "/Sum of all flats: " + sumFlat + "/Level of home: " + level;
    }
}
