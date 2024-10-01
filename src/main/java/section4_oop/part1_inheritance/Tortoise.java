package section4_oop.part1_inheritance;
public class Tortoise extends Animal {

    private static String name;
    private static double age;
    private String movementType = "crawl";
    private double speed;

    public Tortoise(String name, double age) {
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
        double speed = 0.3 * (0.5 + (0.5 * ((190 - age) / 190)));
        return round(speed, 1);
    }

}