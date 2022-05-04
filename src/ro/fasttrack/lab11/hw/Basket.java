package ro.fasttrack.lab11.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Basket {
    private List<Fruit> cumparaturi;

    public Basket() {
        this.cumparaturi = new ArrayList<>();
//        this.cumparaturi.add(new Fruit("asdasd", 1));
    }

    public Basket(List<Fruit> existingFruits) {
//        List<Fruit> myCopy = new ArrayList<>();
//        for(Fruit f : existingFruits) {
//            myCopy.add(f);
//        }
       this.cumparaturi = new ArrayList<>(existingFruits);
    }





    public boolean adaugaCumparatura(Fruit newFruit) {
        return cumparaturi.add(newFruit);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "cumparaturi=" + cumparaturi.toString() +
                '}';
    }
}
