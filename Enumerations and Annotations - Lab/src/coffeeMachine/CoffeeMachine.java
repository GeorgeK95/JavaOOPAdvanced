package coffeeMachine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CoffeeMachine {
    private List<Coin> coins;
    private List<Coffee> coffees;

    public CoffeeMachine() {
        this.coins = new ArrayList<>();
        this.coffees = new ArrayList<>();
    }

    public void buyCoffee(String size, String type) {
        CoffeeSize wantedSize = CoffeeSize.valueOf(size.toUpperCase());
        int wantedPrize = wantedSize.getPrice();

        if (this.calculateCurrentBalance() >= wantedPrize) {
            CoffeeType wantedType = CoffeeType.valueOf(type.toUpperCase());
            this.coffees.add(new Coffee(wantedSize, wantedType));
            this.coins.clear();
        }
    }

    private int calculateCurrentBalance() {
        return this.coins.stream().mapToInt(c -> Integer.parseInt(String.valueOf(c.getValue()))).sum();
    }

    public void insertCoin(String coin) {
        this.coins.add(Coin.valueOf(coin));
    }

    public Iterable<Coffee> coffeesSold() {
        return this.coffees;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }
}
