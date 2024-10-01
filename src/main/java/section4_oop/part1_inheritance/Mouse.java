package section4_oop.part1_inheritance;
public class Mouse extends Animal {
    protected String movementType = "scurry";

    public Mouse(String name, double age) {
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
        double speed = 21 * (0.5 + (0.5 * ((13.0 - super.age) / 13.0)));
        return round(speed, 1);
    }

}