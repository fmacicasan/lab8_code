package ro.fasttrack.lab11.hw;

import ro.fasttrack.lab11.sorting.DecreasingFruitComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Fruit  { //implements Comparable<Fruit>

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("capsuni", 50));
        fruits.add(new Fruit("banana", 5));
        fruits.add(new Fruit("pere", 6));
        fruits.add(new Fruit("mere", 2));
        System.out.println(fruits);

//        Collections.sort(fruits);
        Collections.sort(fruits, new DecreasingFruitComparator().reversed());
        System.out.println(fruits);

    }
    private final String nume;
    private final int quantity;

    public Fruit(String nume, int quantity) {
        this.nume = nume;
        this.quantity = quantity;
    }

    public String getNume() {
        return nume;
    }

    public int getQuantity() {
        return quantity;
    }

    // nu compileaza pentru ca quantity e final
    // si nu poate sa se schimbe o data ce e initializat in constructor
//    public void setQuantity(int newQuantity) {
//        this.quantity = newQuantity;
//    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nume='" + nume + '\'' +
                ", quantity=" + quantity +
                '}';
    }

//    @Override
    public int compareTo(Fruit o) {
        //sort crescator
        return this.nume.compareTo(o.nume);
        //sort descrescator
//        return -1 * this.nume.compareTo(o.nume);
    }
}
