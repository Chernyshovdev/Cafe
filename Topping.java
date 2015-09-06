package ACP8.homeworkProf2.Cafe;

import static ACP8.homeworkProf2.Cafe.PriceList.PRICES;

/**
 * Created by Razer on 04.09.15.
 */
public abstract class Topping {

    public Topping(String description) {
        this.description = description;
        this.cost = PRICES.getPrice(description);
    }

    private String description;

    private double cost;

    public double cost() {
        return cost;
    }
}
