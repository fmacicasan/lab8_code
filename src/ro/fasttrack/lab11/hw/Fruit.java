package ro.fasttrack.lab11.hw;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Fruit {
    private String nume;
    private int quantity;

    public Fruit(String nume, int quantity) {
        this.nume = nume;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nume='" + nume + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
