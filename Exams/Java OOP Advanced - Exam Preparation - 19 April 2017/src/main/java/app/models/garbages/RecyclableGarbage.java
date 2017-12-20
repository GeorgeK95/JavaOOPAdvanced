package app.models.garbages;

import app.waste_disposal.annotations.Recyclable;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Recyclable
public class RecyclableGarbage extends BaseGarbage {

    public RecyclableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
