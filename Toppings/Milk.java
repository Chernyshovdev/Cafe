package ACP8.homeworkProf2.Cafe.Toppings;

import ACP8.homeworkProf2.Cafe.Topping;

import static ACP8.homeworkProf2.Cafe.PriceList.*;

/**
 * Created by Razer on 04.09.15.
 */

public class Milk extends Topping {
    public Milk() {
        super("Milk",PRICES.getPrice("Milk"));
    }
}
