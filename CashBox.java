package ACP8.homeworkProf2.Cafe;

import ACP8.homeworkProf2.Cafe.Drinks.Coffee;
import ACP8.homeworkProf2.Cafe.Drinks.Tea;
import ACP8.homeworkProf2.Cafe.Toppings.Milk;
import ACP8.homeworkProf2.Cafe.Toppings.Sugar;

/**
 * Created by Razer on 04.09.15.
 */
public class CashBox  {
    public static void main(String[] args) {
        Drink drink = new Coffee();
        drink.addTopping(new Milk());
        drink.addTopping(new Sugar());
        System.out.println(drink.cost());
        Drink drink1 = new Tea();
        drink1.addTopping(new Sugar());
        System.out.println(drink1.cost());
    }
}
