package ro.fasttrack.lab13.lab;

import java.util.Arrays;

/**
 * @author flo
 * @since 18.05.2022.
 */
public enum CardinalPoints {
    NORD("N"),
    NORD_VEST("NV"),
    SUD("S"),
    EST("E"),
    VEST("V");


    private String abbreviation;

    CardinalPoints(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String direction() {
        return switch (this) {
            case NORD -> "UP";
            case SUD -> "DOWN";
            case EST -> "RIGHT";
            case VEST -> "LEFT";
            case NORD_VEST -> "LEFTUP";
        };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CardinalPoints.values()));
        System.out.println(CardinalPoints.valueOf("NORD").direction());
        System.out.println(CardinalPoints.NORD.name());
        System.out.println(CardinalPoints.EST.ordinal());
    }




}
