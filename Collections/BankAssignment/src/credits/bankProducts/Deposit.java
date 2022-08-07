package credits.bankProducts;

import bank.Client;

public abstract class Deposit extends BankProduct{


    public Deposit(float annualInterest, int period, float amount, Client client) {
        super(annualInterest, period, amount,client);
    }

    @Override
    float calculateMonthlyPayment() {
       return getAmount()*((getAnnualInterest()/100)/12);
    }

    @Override
    public void makeMonthlyPayment() {
        setAmount(getAmount() + getMonthlyPayment());
        setMonthlyPayment(calculateMonthlyPayment());
        setPeriod(getPeriod()-1);
    }
}
