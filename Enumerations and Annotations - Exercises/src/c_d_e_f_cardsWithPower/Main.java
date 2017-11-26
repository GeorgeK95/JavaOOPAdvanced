package c_d_e_f_cardsWithPower;

import c_d_e_f_cardsWithPower.g_cardGame.core.GameManager;
import c_d_e_f_cardsWithPower.g_cardGame.engine.Engine;
import c_d_e_f_cardsWithPower.g_cardGame.io.ConsoleInputReader;
import c_d_e_f_cardsWithPower.g_cardGame.utils.InputParser;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        Card[] cards = new Card[]{new Card(in.nextLine(), in.nextLine()), new Card(in.nextLine(), in.nextLine())};
        Arrays.sort(cards);
        System.out.println(cards[cards.length - 1]);*/

//        task_6
//        task_6();
//        task_7
//        task_7();
//        task_8
//        task_8();
    }

    private static void task_8() {
        GameManager manager = new GameManager();
        ConsoleInputReader inputReader = new ConsoleInputReader();
        InputParser parser = new InputParser();
        Engine engine = new Engine(manager, inputReader, parser);
        engine.run();
    }

    private static void task_7() {
        DeckOfCards.printDeckOfCards();
    }

    private static void task_6() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        switch (line) {
            case "Rank":
                CustomEnumAnnotation annotation = RankPowers.class.getAnnotation(CustomEnumAnnotation.class);
                System.out.println(String.format("Type = %s, Description = %s", annotation.type(), annotation.description()));
                break;
            case "Suit":
                CustomEnumAnnotation annotation2 = SuitPowers.class.getAnnotation(CustomEnumAnnotation.class);
                System.out.println(String.format("Type = %s, Description = %s", annotation2.type(), annotation2.description()));
                break;
        }
    }
}
