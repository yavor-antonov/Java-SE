package interfaces;

import bank.Client;
import bankProducts.Credit;
import bankProducts.Deposit;

public interface IBank {
    Deposit receiveDeposit(String type,float amount,Client client);
    void payInterest();
    Credit giveCredit(String type, float amount, int period, Client client);
}
