package ACP8.homeworkProf2.Cafe;

import java.util.ArrayList;

/**
 * Created by Razer on 04.09.15.
 */
public abstract class Drink {

    private String description;

    private ArrayList<Topping> toppings=new ArrayList<>();

    public Drink(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void addTopping(Topping e){
        toppings.add(e);
    }

    public double searchPriceToppings(){
        Double price=0.0;
        for(int i=0;i<toppings.size();i++){
            price+=toppings.get(i).cost();
        }
        return price;
    }
}
