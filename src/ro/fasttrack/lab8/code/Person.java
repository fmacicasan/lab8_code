package ro.fasttrack.lab8.code;

/**
 * @author flo
 * @since 06.04.2022.
 */

public class Person implements Talkable {

    private String cnp;

    public Person(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String identify() {
        return "I identify with " + cnp;
    }

    @Override
    public String talk() {
        return "ksalajsdf sdpf  sdpfsdlfjsd sd sd.";
    }

    public String sing() {
        return "lalalalal lalala";
    }
}
