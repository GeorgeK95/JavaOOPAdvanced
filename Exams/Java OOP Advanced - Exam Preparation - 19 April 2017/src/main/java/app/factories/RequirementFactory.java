package app.factories;

import app.waste_disposal.managementSystems.ManagementRequirement;
import app.waste_disposal.managementSystems.Requirement;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class RequirementFactory {
    public static Requirement create(String type, double energy, double capital) {
        return new ManagementRequirement(type, energy, capital);
    }
}
