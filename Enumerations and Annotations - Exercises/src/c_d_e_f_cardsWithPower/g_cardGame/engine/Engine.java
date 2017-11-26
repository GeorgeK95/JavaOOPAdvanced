package c_d_e_f_cardsWithPower.g_cardGame.engine;

import c_d_e_f_cardsWithPower.g_cardGame.core.GameManager;
import c_d_e_f_cardsWithPower.g_cardGame.io.ConsoleInputReader;
import c_d_e_f_cardsWithPower.g_cardGame.utils.InputParser;


/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Engine {
    private GameManager manager;
    private ConsoleInputReader inputReader;
    private InputParser parser;

    public Engine(GameManager manager, ConsoleInputReader inputReader, InputParser parser) {
        this.manager = manager;
        this.inputReader = inputReader;
        this.parser = parser;
    }

    public void run() {
        this.manager.addFirstPlayer(inputReader.readLine());
        this.manager.addSecondPlayer(inputReader.readLine());

        while (true) {
            String[] suitRank = parser.parseInputAsArray(inputReader.readLine());
            if (this.manager.addCardToPlayer(suitRank[0], suitRank[1])) {
                this.manager.printWinner();
                break;
            }
        }

    }
}
