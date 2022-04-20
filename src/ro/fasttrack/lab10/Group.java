package ro.fasttrack.lab10;

/**
 * @author flo
 * @since 20.04.2022.
 */
public class Group {
    public static void main(String[] args) {
        Person ana = new Person("ana", null, 'f', 172);
        Person geamanaAna = new Person("ana", null, 'f', 172);
//        Person geamanaAna = ana;

        System.out.println(ana);
        System.out.println(geamanaAna);
        System.out.println(ana == geamanaAna);
        System.out.println(ana.toString().equals(geamanaAna.toString()));
        System.out.println(ana == ana);
        System.out.println(ana.equals(geamanaAna));
        System.out.println(ana.equals(ana));
    }
}
