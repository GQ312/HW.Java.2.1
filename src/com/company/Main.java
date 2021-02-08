package com.company;

public class Main {

    public static void main(String[] args) {
        Home objectA = new Home(6,18, Level.FIFTEEN);

        Flat objectB = new Flat(5,15,55,2, Position.MIDDLE);
        Flat objectC = new Flat(9, 27, 5,5, Position.LEFT);

        objectA.taxHome(5);
        objectA.taxHome(5, 6);
        objectA.taxHome(6,Level.FIFTEEN);

        objectB.taxHome(5);
        objectB.taxHome(5,7);
        objectB.taxHome(4, Level.NINE);
        
        objectC.taxHome(5);
        objectC.taxHome(3,7);
        objectC.taxHome(5, Level.THREE);

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
    }
}
