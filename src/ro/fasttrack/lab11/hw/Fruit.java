package ro.fasttrack.lab11.hw;

/**
 * @author flo
 * @since 04.05.2022.
 */
public class Fruit {
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
}
