package ro.fasttrack.lab8.code.advertising;

/**
 * @author flo
 * @since 13.04.2022.
 */
public class FacebookAdvertiser implements Advertiser {

    @Override
    public void sendAdvertisement(String content) {
        connectToFacebook("company:password");
        String[] potentialTargets = figureOutTheAdvertisementTargets(content);
        sendTheAdvertisement(content, potentialTargets);
        trackInternalCost();
    }

    private String[] figureOutTheAdvertisementTargets(String content) {
        return new String[0];
    }

    private void trackInternalCost() {

    }

    private void sendTheAdvertisement(String content, String[] potentialTargets) {

    }

    private void connectToFacebook(String s) {

    }

    @Override
    public String buildMonthlyReport(int monthOfYear, int year) {
        return null;
    }

    @Override
    public int calculateCost(int momthOfYear, int year) {
        return 0;
    }
}
