package section4_oop.part1_inheritance;
public class Horse extends Animal{
    private static String name;
    private static double age;
    private String movementType = "gallop";
    private double speed;

    public Horse(String name, double age) {
        super(name, age);}

    /**
     * returns the movement type
     * @return movementType the way the animal moves
     */
    @Override
    public String getMovementType() {
        return movementType;
    }

    /**
     * returns the speed of this animal
     * @return speed the speed of this animal
     */
    @Override
    public double getSpeed() {
        double speed = 88 * (0.5 + (0.5 * ((62.0 - super.age) / 62.0)));
        return round(speed, 1);
    }

}