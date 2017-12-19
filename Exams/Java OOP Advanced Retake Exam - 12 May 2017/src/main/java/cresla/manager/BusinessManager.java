package cresla.manager;

import cresla.factories.AbsordingModuleFactory;
import cresla.factories.EnergyModuleFactory;
import cresla.factories.ReactorFactory;
import cresla.interfaces.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class BusinessManager implements Manager {
    private static final String CREATED_S_REACTOR_D = "Created %s Reactor - %d";
    private static final String ADDED_S_D_TO_REACTOR_D = "Added %s - %d to Reactor - %d";
    private static final Predicate<Identifiable> ENERGY_MODULES_PREDICATE = x -> x.getClass().getSimpleName().equals("CryogenRod");
    private static final Predicate<Identifiable> ABSORBING_MODULES_PREDICATE = x -> x.getClass().getSimpleName().equals("CooldownSystem") || x.getClass().getSimpleName().equals("HeatProcessor");
    private static final String CRYO_REACTOR = "CryoReactor";
    private static final String HEAT_REACTOR = "HeatReactor";

    private Map<Integer, Identifiable> modules;
    private Map<Integer, Reactor> reactors;

    public BusinessManager() {
        this.modules = new LinkedHashMap<>();
        this.reactors = new LinkedHashMap<>();
    }

    @Override
    public String reactorCommand(List<String> arguments) {
        Reactor reactor = ReactorFactory.create(arguments.get(1), Integer.parseInt(arguments.get(2)), Integer.parseInt(arguments.get(3)));
        this.reactors.put(reactor.getId(), reactor);
        return String.format(CREATED_S_REACTOR_D, arguments.get(1), reactor.getId());
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        String moduleType = arguments.get(2);
        int reactorId = Integer.parseInt(arguments.get(1));
        int additionalParam = Integer.parseInt(arguments.get(3));
        Module module = null;

        switch (moduleType) {
            case "CooldownSystem":
            case "HeatProcessor":
                AbsorbingModule absorbingModule = AbsordingModuleFactory.createAbsording(moduleType, additionalParam);
                this.reactors.get(reactorId).addAbsorbingModule(absorbingModule);
                this.modules.put(absorbingModule.getId(), absorbingModule);
                module = absorbingModule;
                break;
            case "CryogenRod":
                EnergyModule energyModule = EnergyModuleFactory.create(additionalParam);
                this.reactors.get(reactorId).addEnergyModule(energyModule);
                this.modules.put(energyModule.getId(), energyModule);
                module = energyModule;
                break;
        }

        return String.format(ADDED_S_D_TO_REACTOR_D, arguments.get(2), module.getId(), reactorId);
    }


    @Override
    public String reportCommand(List<String> arguments) {
        int id = Integer.parseInt(arguments.get(1));

        if (this.reactors.containsKey(id)) {
            return this.reactors.get(id).toString();
        } else {
            return this.modules.get(id).toString();
        }
    }

    @Override
    public String exitCommand(List<String> arguments) {
        StringBuilder builder = new StringBuilder()
                .append(String.format("Cryo Reactors: %d", this.reactors.values().stream().filter(r -> r.getClass().getSimpleName().equals(CRYO_REACTOR)).count())).append(System.lineSeparator())
                .append(String.format("Heat Reactors: %d", this.reactors.values().stream().filter(r -> r.getClass().getSimpleName().equals(HEAT_REACTOR)).count())).append(System.lineSeparator())
                .append(String.format("Energy Modules: %d", this.modules.values().stream().filter(ENERGY_MODULES_PREDICATE).count())).append(System.lineSeparator())
                .append(String.format("Absorbing Modules: %d", this.modules.values().stream().filter(ABSORBING_MODULES_PREDICATE).count())).append(System.lineSeparator())
                .append(String.format("Total Energy Output: %d", this.reactors.values().stream().mapToLong(Reactor::getTotalEnergyOutput).sum())).append(System.lineSeparator())
                .append(String.format("Total Heat Absorbing: %d", this.reactors.values().stream().mapToLong(Reactor::getTotalHeatAbsorbing).sum()));
        return builder.toString();
    }
}
