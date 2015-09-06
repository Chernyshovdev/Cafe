package ACP8.homeworkProf2.Cafe;

import java.util.ArrayList;

/**
 * Created by Razer on 04.09.15.
 */
public abstract class Drink {

    private double cost;

    private String description;

    private ArrayList<Topping> toppings=new ArrayList<>();

    public Drink(String description,double cost) {
        this.description = description;
        this.cost=cost;

    }

    public double cost() {
        Double price=0.0;
        for(Topping topping:toppings){
            price+=topping.cost();
        }
        return price+cost;
    }

    public void addTopping(Topping e){
        toppings.add(e);
    }

}
