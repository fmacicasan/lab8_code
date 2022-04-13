package ro.fasttrack.lab8.code.advertising;

import ro.fasttrack.lab8.code.delivery.Livrator;

/**
 * @author flo
 * @since 13.04.2022.
 */
public class PrintAdvertiser implements Advertiser {
    private Livrator livrator;
    @Override
    public void sendAdvertisement(String content) {
        String flyer = designFlyer(content);
        String printedFlyer = printFlyer(flyer);
        String[] addresses = figureOutAddressesOfPotentialInterestedClients();
        for(String address : addresses) {
//            livrator.move(address, printedFlyer); //nu compileaza pentu ca livratorul stie sa livreze doar mancare nu si printed flyers
            deliveryFlyer(address, printedFlyer);
        }


    }

    private void deliveryFlyer(String address, String printedFlyer) {


    }

    private String[] figureOutAddressesOfPotentialInterestedClients() {
        return new String[0];
    }

    private String printFlyer(String flyer) {
        return null;
    }

    private String designFlyer(String content) {
        return null;
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
