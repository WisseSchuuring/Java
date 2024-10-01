/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */
package section4_oop.part1_inheritance;

/**
 *
 * @author Michiel Noback [michiel.noback@gmail.com]
 * @version 0.0.1
 */
public class Animal {
    String name;
    double age;

    String movementType = "walk";
    double speed = 10;


    protected Animal(String name, double age){
        this.name = name;
        this.age = age;
    }

    /**
     * returns the name of the animal
     * @return name the species name
     */
    public String getName() {
        return this.name;
    }

    /**
     * returns the movement type
     * @return movementType the way the animal moves
     */
    public String getMovementType(){
        return this.movementType;
    }

    /**
     * returns the speed of this animal
     * @return speed the speed of this animal
     */
    public double getSpeed(){
        return speed;
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

}