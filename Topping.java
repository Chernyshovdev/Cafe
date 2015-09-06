package ACP8.homeworkProf2.Cafe;

/**
 * Created by Razer on 04.09.15.
 */
public abstract class Topping {

    public Topping(String description,double cost) {
        this.description = description;
        this.cost=cost;
    }

    private String description;

    private double cost;

    public  double cost(){
        return cost;
    }
}
