/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */

package section2_syntax.part2_operators;

public class WeightUnitsSolver {

    /**
     * Returns the number of Pounds, Ounces and Grams represented by this quantity of grams,
     * encapsulated in a BritishWeightUnits object.
     * @param grams the grams quantity
     * @return a BritishWeightUnits instance
     * @throws IllegalArgumentException when the Grams quantity is 
     */
    public BritishWeightUnits convertFromGrams(int grams) {
        //YOUR CODE HERE

        //change this variable to get a correct testing condition
        final int gramsTest = 0;

        if (grams <= gramsTest) {
            throw new IllegalArgumentException("Error: grams should be above 0. Given: grams=" + grams);
        }

        grams = 1000;
        int firstLeft = grams%454;
        int secondLeft = firstLeft%28;

        int pounds = (grams - (firstLeft))/454;
        System.out.println(pounds);
        int ounces = (firstLeft - (secondLeft))/28;
        System.out.println(ounces);
        int gramsLeft = secondLeft;
        System.out.println(gramsLeft);



        //solve the pounds, ounces and grams, create and return a BritishWeightUnits instance
        //YOUR CODE HERE
        BritishWeightUnits units = new BritishWeightUnits(pounds, ounces, gramsLeft);
        return units;
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}
