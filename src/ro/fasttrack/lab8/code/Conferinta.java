package ro.fasttrack.lab8.code;

/**
 * @author flo
 * @since 06.04.2022.
 */
public class Conferinta {
    private Talkable speaker;

    public Conferinta(Talkable speaker) {
        this.speaker = speaker;
    }

    public String goLive() {
        return "Going live...with " + speaker.identify() + " saying..."  + speaker.talk();
    }
}
