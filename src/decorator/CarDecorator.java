
package decorator;

import factory.ICar;
import factory.ChassisSize;
import factory.Region;

public abstract class CarDecorator implements ICar {

    protected ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public ChassisSize getSize() {
        return car.getSize();
    }

    @Override
    public Region getRegion() {
        return car.getRegion();
    }

    @Override
    public void formSize() {
        car.formSize();
    }
}
