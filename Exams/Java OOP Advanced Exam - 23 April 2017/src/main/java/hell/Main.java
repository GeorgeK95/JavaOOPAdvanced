package hell;

import hell.engines.Engine;
import hell.interfaces.InputReader;
import hell.interfaces.OutputWriter;
import hell.interfaces.Parser;
import hell.interpreters.CommandInterpreter;
import hell.interpreters.Interpreter;
import hell.io.ConsoleInputReader;
import hell.io.ConsoleOutputWriter;
import hell.repository.HeroRepository;
import hell.repository.Repository;
import hell.utils.InputParser;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        Repository repository = new HeroRepository();
        Parser parser = new InputParser();
        Interpreter interpreter = new CommandInterpreter(repository, parser);
        Runnable runnable = new Engine(reader, writer, interpreter);

        runnable.run();
    }
}
