package interfaces;

import bank.Client;
import credits.bankProducts.Credit;
import credits.bankProducts.Deposit;

public interface IBank {
    Deposit receiveDeposit(String type,float amount,Client client);
    void payInterest();
    Credit giveCredit(String type, float amount, int period, Client client);
}
