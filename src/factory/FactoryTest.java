package factory;

public class FactoryTest {
    public static void main(String[] args) {

        // First customer: China, Midsize

        CarFactory chinaFactory = new ChinaCarFactory();

        ICar chinaCar = chinaFactory.createCar(
                ChassisSize.MIDSIZE,
                "China Midsize Car",
                "A comfortable midsize passenger car."
        );

        System.out.println("===== First Order =====");

        System.out.println(chinaCar.getDescription());

        chinaCar.formSize();


        // Second customer: Middle East, Fullsize

        CarFactory middleEastFactory =
                new MiddleEastCarFactory();

        ICar middleEastCar = middleEastFactory.createCar(
                ChassisSize.FULLSIZE,
                "Middle East Fullsize Car",
                "A spacious fullsize passenger car."
        );

        System.out.println("\n===== Second Order =====");

        System.out.println(middleEastCar.getDescription());

        middleEastCar.formSize();
    }
}
