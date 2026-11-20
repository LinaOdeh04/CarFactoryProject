package factory;

public class AsiaCarFactory extends CarFactory{
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
                Region.ASIA
        );
    }
}
