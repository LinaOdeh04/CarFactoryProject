package factory;

public class MiddleEastCarFactory extends CarFactory{
    @Override
    public ICar createCar(
            ChassisSize size,
            String name,
            String description
    ) {

        return new BasicCar(
                name,
                description,
                size,
                Region.MIDDLE_EAST
        );
    }
}
