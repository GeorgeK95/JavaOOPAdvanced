package app.manager;

import app.waste_disposal.contracts.Waste;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Manager {
    String processGarbageCommand(Waste garbage);

    String statusCommand();

    String changeManagementRequirement(double minEnergy, double minCapital, String type);
}
