package cresla.factories;

import cresla.entities.containers.ModuleContainer;
import cresla.entities.reactors.CryoReactor;
import cresla.entities.reactors.HeatReactor;
import cresla.idGenerator.IdGenerator;
import cresla.interfaces.Reactor;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ReactorFactory {

    public static Reactor create(String type, int parameter, int moduleCapacity) {
        switch (type) {
            case "Cryo":
                return new CryoReactor(new ModuleContainer(moduleCapacity), parameter, IdGenerator.getNextId());
            case "Heat":
                return new HeatReactor(new ModuleContainer(moduleCapacity), parameter, IdGenerator.getNextId());
            default:
                return null;
        }
    }
}
