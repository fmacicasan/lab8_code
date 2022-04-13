package ro.fasttrack.lab8.code;

/**
 * @author flo
 * @since 06.04.2022.
 */
public class TalkMain {
    public static void main(String[] args) {
        Person ana = new Person("2761205127905");
        System.out.println(ana.identify());
        System.out.println(ana.talk());
        ana.sing();
        Talkable talker = ana;
//        talker.sing();
        System.out.println(talker.identify());

        Talkable anotherTalker = new Vaca("suzy");
        System.out.println(anotherTalker.identify());

        System.out.println(new Conferinta(ana).goLive());
        System.out.println(new Conferinta(anotherTalker).goLive());

    }
}
