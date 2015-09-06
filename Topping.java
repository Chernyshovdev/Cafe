package ACP8.homeworkProf2.Cafe;

/**
 * Created by Razer on 04.09.15.
 */
public abstract class Topping {

    public Topping(String description) {
        this.description = description;
    }

    private String description;

    public abstract double cost();
}
