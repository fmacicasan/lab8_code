package ro.fasttrack.lab9;

/**
 * @author flo
 * @since 13.04.2022.
 */
public class Car extends Vehicle {
    private int buget;
    @Override
    public void moves() {
        System.out.println("Car moves");
        if(buget > 100) {
            System.out.println("asdasd");
        } else {
            super.moves();
        }
    }
}
