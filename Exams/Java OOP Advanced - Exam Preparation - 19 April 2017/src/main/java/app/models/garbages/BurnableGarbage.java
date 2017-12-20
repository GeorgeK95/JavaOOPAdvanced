package app.models.garbages;

import app.waste_disposal.annotations.Burnable;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Burnable
public class BurnableGarbage extends BaseGarbage {

    public BurnableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
