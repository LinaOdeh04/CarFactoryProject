
package observer;

import factory.ChassisSize;
import factory.Region;

public interface Observer {

    void update(
            SalesInventory inventory,
            Region region,
            ChassisSize size
    );
}
