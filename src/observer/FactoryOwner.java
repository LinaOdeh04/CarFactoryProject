
package observer;

import factory.ChassisSize;
import factory.Region;

public class FactoryOwner implements Observer {

    @Override
    public void update(
            SalesInventory inventory,
            Region region,
            ChassisSize size
    ) {

        System.out.println("\n*** Factory Owner Notification ***");

        System.out.println("A new car has been sold!");

        System.out.println("Region: " + region);

        System.out.println("Chassis Size: " + size);

        System.out.println(
                "Cars sold in this category: "
                + inventory.getSoldCount(region, size)
        );

        System.out.println(
                "Total cars sold: "
                + inventory.getTotalSold()
        );

        inventory.printReport();
    }
}
