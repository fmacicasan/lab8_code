package ro.fasttrack.lab8.code.advertising;

/**
 * @author flo
 * @since 13.04.2022.
 */
public class Company {

    private Advertiser advertiser;
    private int montlhyAdvertisementBudget = 200;

    public void monthylExpenses() {
        salaryExpenses();
        rawMaterialsExpenses();
        distributionExpenses();
        advertiser.buildMonthlyReport(4, 2022);
    }

    private void distributionExpenses() {

    }

    private void rawMaterialsExpenses() {

    }

    private void salaryExpenses() {

    }


    public void launchProduct(String name) {
        designProduct();
        buildAndTestNewProduct();
        if(verifyIfAdvertisementBudgetIsAvailable()) {
            advertiser.sendAdvertisement("Launching the new super secret product.");
        }
        waitForOrders();
    }

    private boolean verifyIfAdvertisementBudgetIsAvailable() {
        return montlhyAdvertisementBudget > advertiser.calculateCost(4, 2022);
    }

    private void waitForOrders() {

    }

    private void buildAndTestNewProduct() {

    }

    private void designProduct() {
        System.out.println("Doing the super secret desing of the product.");
    }
}
