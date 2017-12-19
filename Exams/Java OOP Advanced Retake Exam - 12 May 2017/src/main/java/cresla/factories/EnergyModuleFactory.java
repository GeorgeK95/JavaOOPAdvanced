package cresla.factories;

import cresla.entities.modules.CryogenRod;
import cresla.idGenerator.IdGenerator;
import cresla.interfaces.EnergyModule;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class EnergyModuleFactory {

    public static EnergyModule create(int parameter) {
        return new CryogenRod(IdGenerator.getNextId(), parameter);
    }

}
