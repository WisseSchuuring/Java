/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */

package section4_oop.part1_inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import static java.lang.Double.parseDouble;

/**
 *
 * @author Michiel Noback [michiel.noback@gmail.com]
 * @version 0.0.1
 */
public class AnimalSimulator {
    public static void main(String[] args) {
        AnimalSimulator anSim = new AnimalSimulator();
        anSim.start(args);
    }

    private void printMessage(Animal animal){
        String prefix = "";
        if ("eaiouEAIOU".indexOf(animal.getName().charAt(0)) >=0) {
            prefix = "An";}
        else{
            prefix = "A";
        }
        String message = prefix + " " + animal.getName() + " of age " + (int) animal.age + " moving in " +
                animal.getMovementType() + " at " + animal.getSpeed() + " km/h";
        System.out.println(message);
    }

    private void printUsage(){
        String[] supportedAnimals = getSupportedAnimals().toArray(new String[0]);
        for (int i = 0; (i + 1) <= supportedAnimals.length; i += 1) {
            String positionedAnimal = (i + 1) + ": " + getSupportedAnimals().get(i);
            System.out.println(positionedAnimal);
        }
    }

    public static boolean inAgeRange(double value, double max){
        return (value>= 0) && (value<= max);
    }

    private void start(String[] args) {
        //YOUR CODE HERE (and remove the throw statement)
        //start processing command line arguments and run the "simulation"

        if (args.length == 0 || "help".equals(args[0])) {
            System.out.println(
                    "Usage: java AnimalSimulator <Species age Species age ...>" + System.lineSeparator()
                            + "Supported species (in alphabetical order):");
            printUsage();
        }
        else {

            for (int i = 0; (i + 1) < args.length; i += 2) {
                String name = args[i];
                Double age = parseDouble(args[i + 1]);
                if (getSupportedAnimals().contains(name)) {
                    if (Objects.equals(name, "Mouse")) {
                        if (inAgeRange(age, 13)) {
                            Mouse animal = new Mouse(name, age);
                            printMessage(animal);
                        } else {
                            System.out.println("Error: maximum age of Mouse is 13 years. Please give new values");
                        }
                    }
                    if (Objects.equals(name, "Horse")) {
                        if (inAgeRange(age, 62)) {
                            Horse animal = new Horse(name, age);
                            printMessage(animal);
                        } else {
                            System.out.println("Error: maximum age of Horse is 62 years. Please give new values");
                        }
                    }
                    if (Objects.equals(name, "Elephant")) {
                        if (inAgeRange(age, 86)) {
                            Elephant animal = new Elephant(name, age);
                            printMessage(animal);
                        } else {
                            System.out.println("Error: maximum age of Elephant is 86 years. Please give new values");
                        }
                    }
                    if (Objects.equals(name, "Tortoise")) {
                        if (inAgeRange(age, 190)) {
                            Tortoise animal = new Tortoise(name, age);
                            printMessage(animal);
                        } else {
                            System.out.println("Error: maximum age of Tortoise is 190 years. Please give new values");
                        }
                    }
                    } else {
                        System.out.println("Error: animal species " + name + " is not known. run with single parameter \"help\" to get a listing of available species. Please give new values");
                }
            }
        }
    }


                /**
                 * returns all supported animals as List, alphabetically ordered
                 * @return supportedAnimals the package section4_oop.part1_inheritance;supported animals
                 */
                public List<String> getSupportedAnimals () {
                    List<String> supportedAnimals = new ArrayList<>();
                    supportedAnimals.add("Elephant");
                    supportedAnimals.add("Horse");
                    supportedAnimals.add("Mouse");
                    supportedAnimals.add("Tortoise");
                    Collections.sort(supportedAnimals);
                    return supportedAnimals;
                }
            }