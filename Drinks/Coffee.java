package ACP8.homeworkProf2.Cafe.Drinks;

/**
 * Created by Razer on 04.09.15.
 */

import ACP8.homeworkProf2.Cafe.Drink;

import static ACP8.homeworkProf2.Cafe.PriceList.*;

public class Coffee extends Drink {

    public Coffee() {
        super("Americano");
    }
    @Override
    public double cost() {
        return PRICES.getCoffeePrice()+searchPriceToppings();
    }

}
