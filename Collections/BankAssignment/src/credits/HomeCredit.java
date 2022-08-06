package credits;

import bank.Client;
import bankProducts.Credit;

public class HomeCredit extends Credit {
    private static int counterID = 0;

    public HomeCredit(int period, float amount, Client client) {
        super(6, period, amount,client);
        counterID += 1;
    }

    @Override
    protected String generateProductID() {
        return "HC" + String.format("%04d", counterID);
    }
}
