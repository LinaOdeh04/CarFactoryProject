
package decorator;

import factory.ICar;

public class LuxuryInteriorPack extends CarDecorator {

    public LuxuryInteriorPack(ICar car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription()
                + " + Luxury Interior Pack (Premium Stitched Leather Seats)";
    }
}
