package ro.fasttrack.lab11.sorting;

import ro.fasttrack.lab11.hw.Fruit;

import java.util.Comparator;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class DecreasingFruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.getNume().compareTo(o1.getNume());
    }
}
