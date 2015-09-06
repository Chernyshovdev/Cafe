package ACP8.homeworkProf2.Cafe.Drinks;

/**
 * Created by Razer on 04.09.15.
 */
import ACP8.homeworkProf2.Cafe.Drink;

import static ACP8.homeworkProf2.Cafe.PriceList.*;

public class Tea extends Drink {
    public Tea() {
        super("England tea",PRICES.getTeaPrice());
    }
}
