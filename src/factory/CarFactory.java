package factory;

public abstract class CarFactory {
    public abstract ICar createCar(
            ChassisSize size,
            String name,
            String description
    );
}
