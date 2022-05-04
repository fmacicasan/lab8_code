package ro.fasttrack.lab11.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Supermarket {

    public static void main(String[] args) {
        Basket myBascket = new Basket();
        myBascket.adaugaCumparatura(new Fruit("capsuni", 100));
        System.out.println(myBascket);
        myBascket.adaugaCumparatura(new Fruit("mere", 2));
        System.out.println(myBascket);

        List<Fruit> existingFruits = new ArrayList<>();
        existingFruits.add(new Fruit("pere", 5));
        existingFruits.add(new Fruit("cirese", 1));
        Basket filledBasket = new Basket(existingFruits);
        System.out.println(filledBasket);
        existingFruits.add(new Fruit("banana", 5));
        System.out.println(filledBasket);
        filledBasket.adaugaCumparatura(new Fruit("bananan", 3));
        System.out.println(filledBasket);
    }
}
