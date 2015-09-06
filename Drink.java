package ACP8.homeworkProf2.Cafe;

import java.util.ArrayList;

/**
 * Created by Razer on 04.09.15.
 */
import static ACP8.homeworkProf2.Cafe.PriceList.*;

public abstract class Drink {

    private double cost;

    private String description;

    private ArrayList<Topping> toppings = new ArrayList<>();

    public Drink(String description) {
        this.description = description;
        this.cost = PRICES.getPrice(description);
    }

    public double cost() {
        double price = 0.0;
        for (Topping topping : toppings) {
            price += topping.cost();
        }
        return price + cost;
    }

    public void addTopping(Topping e) {
        toppings.add(e);
    }

}
