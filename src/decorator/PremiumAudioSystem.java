

package decorator;
import factory.ICar;

public class PremiumAudioSystem extends CarDecorator {

    public PremiumAudioSystem(ICar car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription()
                + " + Premium Audio System (Surround Sound)";
    }
}
