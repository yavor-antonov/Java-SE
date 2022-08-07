package deposits;

import bank.Client;
import credits.bankProducts.Deposit;

public class LongDeposit extends Deposit {
    private static int counterID = 0;

    public LongDeposit(float amount, Client client) {
        super(5, 12, amount,client);
        counterID += 1;
    }

    @Override
    protected String generateProductID() {
        return "LD" + String.format("%04d", counterID);
    }
}
