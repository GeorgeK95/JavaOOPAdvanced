package c_barracksWars;

import c_barracksWars.contracts.Repository;
import c_barracksWars.contracts.UnitFactory;
import c_barracksWars.core.Engine;
import c_barracksWars.core.factories.UnitFactoryImpl;
import c_barracksWars.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
