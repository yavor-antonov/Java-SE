package deposits;


import bank.Client;
import credits.bankProducts.Deposit;

public class ShortDeposit extends Deposit {
    private static int counterID = 0;

    public ShortDeposit(float amount, Client client) {
        super(3, 3, amount,client);
        counterID += 1;
    }

    @Override
    protected String generateProductID() {
        return "SD" + String.format("%04d", counterID);
    }

}
