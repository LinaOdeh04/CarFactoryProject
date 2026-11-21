
package observer;

import factory.ChassisSize;
import factory.Region;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(Region region, ChassisSize size);
}
