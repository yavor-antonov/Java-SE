package interfaces;

import bank.Bank;
import bankProducts.Deposit;

public interface IClient {
    void openDeposit (float amount, String type, Bank bank);
    void requestCredit(float amount,String type,Bank bank, int period);
    void payCredit(Bank bank);

}
