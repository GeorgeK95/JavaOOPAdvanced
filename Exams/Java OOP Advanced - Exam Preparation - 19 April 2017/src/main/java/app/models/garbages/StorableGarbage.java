package app.models.garbages;

import app.waste_disposal.annotations.Storable;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Storable
public class StorableGarbage extends BaseGarbage {

    public StorableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
