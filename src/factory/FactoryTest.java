
package factory;

import observer.FactoryOwner;
import observer.SalesInventory;

public class FactoryTest {

    public static void main(String[] args) {

        // Create sales inventory
        SalesInventory inventory = new SalesInventory();

        // Register factory owner as observer
        FactoryOwner owner = new FactoryOwner();

        inventory.attach(owner);


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

        // Record first sale
        inventory.recordSale(chinaCar);


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

        // Record second sale
        inventory.recordSale(middleEastCar);


        // Remove observer when monitoring is no longer needed
        inventory.detach(owner);
    }
}
