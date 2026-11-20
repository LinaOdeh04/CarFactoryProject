package factory;

public class ChinaCarFactory extends CarFactory {
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
                Region.CHINA
        );
    }
}
