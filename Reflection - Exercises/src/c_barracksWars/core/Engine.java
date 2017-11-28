package c_barracksWars.core;


import c_barracksWars.contracts.Executable;
import c_barracksWars.contracts.Repository;
import c_barracksWars.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Engine implements Runnable {

    private static final String COMMANDS_PACKAGE = "c_barracksWars.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public  Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];

                char firstLetter = Character.toUpperCase(commandName.charAt(0));
                String className = COMMANDS_PACKAGE + firstLetter + commandName.substring(1);
                Constructor<Executable> constructorCommand = (Constructor<Executable>) Class.forName(className)
                        .getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
                constructorCommand.setAccessible(true);
                Executable executable = constructorCommand.newInstance(data, repository, unitFactory);
                String result = executable.execute();

                if (result.equals("fight")) {
                    break;
                }

                if (!result.equals("")) {
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
