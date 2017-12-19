package cresla.factories;

import cresla.entities.modules.CooldownSystem;
import cresla.entities.modules.HeatProcessor;
import cresla.idGenerator.IdGenerator;
import cresla.interfaces.AbsorbingModule;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class AbsordingModuleFactory {

    public static AbsorbingModule createAbsording(String type, int parameter) {
        switch (type) {
            case "HeatProcessor":
                return new HeatProcessor(IdGenerator.getNextId(), parameter);
            case "CooldownSystem":
                return new CooldownSystem(IdGenerator.getNextId(), parameter);
            default:
                return null;
        }
    }
}
