package ro.fasttrack.lab8.code.advertising;

/**
 * @author flo
 * @since 13.04.2022.
 */
public interface Advertiser {
    void sendAdvertisement(String content);

    String buildMonthlyReport(int monthOfYear, int year);

    int calculateCost(int momthOfYear, int year);
}
