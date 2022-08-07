package credits;

import bank.Client;
import credits.bankProducts.Credit;

public class ConsumerCredit extends Credit {
    private static int counterID = 0;

    public ConsumerCredit(int period, float amount, Client client) {
        super(10, period, amount,client);
        counterID += 1;
    }

    @Override
    protected String generateProductID() {
        return "CC" + String.format("%04d", counterID);
    }
}
