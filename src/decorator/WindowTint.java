
package decorator;

import factory.ICar;

public class WindowTint extends CarDecorator {

    public WindowTint(ICar car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription()
                + " + Window Tint (Heat-Blocking Dark Window Film)";
    }
}
