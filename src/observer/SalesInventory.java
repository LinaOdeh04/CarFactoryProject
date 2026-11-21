
package observer;

import factory.ChassisSize;
import factory.ICar;
import factory.Region;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class SalesInventory implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private final Map<Region, Map<ChassisSize, Integer>> soldCars =
            new EnumMap<>(Region.class);

    public SalesInventory() {

        for (Region region : Region.values()) {

            Map<ChassisSize, Integer> sizes =
                    new EnumMap<>(ChassisSize.class);

            for (ChassisSize size : ChassisSize.values()) {
                sizes.put(size, 0);
            }

            soldCars.put(region, sizes);
        }
    }

    @Override
    public void attach(Observer observer) {

        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Region region, ChassisSize size) {

        for (Observer observer : new ArrayList<>(observers)) {
            observer.update(this, region, size);
        }
    }

    public void recordSale(ICar car) {

        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }

        Region region = car.getRegion();
        ChassisSize size = car.getSize();

        int currentCount = soldCars.get(region).get(size);

        soldCars.get(region).put(size, currentCount + 1);

        notifyObservers(region, size);
    }

    public int getSoldCount(Region region, ChassisSize size) {
        return soldCars.get(region).get(size);
    }

    public int getTotalSold() {

        int total = 0;

        for (Region region : Region.values()) {

            for (ChassisSize size : ChassisSize.values()) {

                total += getSoldCount(region, size);
            }
        }

        return total;
    }

    public void printReport() {

        System.out.println("\n===== Sales Inventory Report =====");

        for (Region region : Region.values()) {

            System.out.println("\nRegion: " + region);

            for (ChassisSize size : ChassisSize.values()) {

                System.out.println(
                        size + ": " + getSoldCount(region, size)
                );
            }
        }

        System.out.println("\nTotal Cars Sold: " + getTotalSold());
        System.out.println("==================================");
    }
}
