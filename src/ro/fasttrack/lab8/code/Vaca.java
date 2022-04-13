package ro.fasttrack.lab8.code;

/**
 * @author flo
 * @since 06.04.2022.
 */
public class Vaca implements Talkable {
    private String name;

    public Vaca(String name) {
        this.name = name;
    }

    @Override
    public String talk() {
        return "mmmmmmuuuuuuu!";
    }

    @Override
    public String identify() {
        return "Ding! Chipul imi spune ca sunt vaca " + name;
    }
}
