package interfaces;

import bank.Bank;

public interface IClient {
    void openDeposit (float amount, String type, Bank bank);
    void requestCredit(float amount,String type,Bank bank, int period);
    void payCredit(Bank bank);

}
