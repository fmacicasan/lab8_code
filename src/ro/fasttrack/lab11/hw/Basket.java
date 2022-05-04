package ro.fasttrack.lab11.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Basket {
    private final List<Fruit> cumparaturi;

    public Basket() {
        this.cumparaturi = new ArrayList<>();
//        this.cumparaturi.add(new Fruit("asdasd", 1));
    }

    public Basket(List<Fruit> existingFruits) {
//        List<Fruit> myCopy = new ArrayList<>();
//        for(Fruit f : existingFruits) {
//            myCopy.add(f);
//        }
        // if no copy constructor then the reference that is passed in can be changed from the client that calls the constructor
       this.cumparaturi = new ArrayList<>(existingFruits); // use of copy constructor to keep  encapsulation
    }

    public boolean adaugaCumparatura(Fruit newFruit) {
        return cumparaturi.add(newFruit);
    }

    public List<Fruit> getCumparaturi() {
        // folosim copy-costructor pentru a nu expune referinta din starea obiectului
        return new ArrayList<>(this.cumparaturi);
        // returneaza o lista ce nu poate fi modificata, va arunca exceptie pe metoda add
//        return Collections.unmodifiableList(cumparaturi);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "cumparaturi=" + cumparaturi.toString() +
                '}';
    }
}
