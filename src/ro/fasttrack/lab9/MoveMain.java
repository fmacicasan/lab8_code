package ro.fasttrack.lab9;

/**
 * @author flo
 * @since 13.04.2022.
 */
public class MoveMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.moves();
        v = new Car();
        v.moves();
        Car c = new Car();
        System.out.println(c.toString());
        System.out.println(v.toString());
//        c.hashCode();
//        c.equals(c);
//        c = new Vehicle();
    }
}
