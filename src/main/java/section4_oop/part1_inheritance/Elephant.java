package section4_oop.part1_inheritance;
public class Elephant extends Animal {
    private static String name;
    private static double age;
    private String movementType = "thunder";
    private double speed;

    public Elephant(String name, double age) {
        super(name, age);
    }


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
        double speed = 40 * (0.5 + (0.5 * ((86 - super.age) / 86)));
        return round(speed, 1);
    }

}