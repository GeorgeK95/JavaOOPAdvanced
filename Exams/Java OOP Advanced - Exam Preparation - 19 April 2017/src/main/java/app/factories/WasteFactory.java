package app.factories;

import app.models.garbages.BurnableGarbage;
import app.models.garbages.RecyclableGarbage;
import app.models.garbages.StorableGarbage;
import app.waste_disposal.contracts.Waste;


/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class WasteFactory {
    public static Waste create(String name, double weight, double volume, String type) {
        switch (type) {
            case "Recyclable":
                return new RecyclableGarbage(name, volume, weight);
            case "Burnable":
                return new BurnableGarbage(name, volume, weight);
            case "Storable":
                return new StorableGarbage(name, volume, weight);
            default:
                return null;
        }
    }
}
