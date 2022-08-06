package bankProducts;

import bank.Client;

public abstract class Credit extends BankProduct{
    public Credit(float annualInterest, int period, float amount, Client client) {
        super(annualInterest, period, amount,client);
    }

    @Override
    float calculateMonthlyPayment() {
        float totalInterest = getAmount()*(getAnnualInterest()/100/12)*getPeriod();
        float totalAmountForPaying = getAmount() + totalInterest;
        return totalAmountForPaying/getPeriod();
    }

    @Override
    public void makeMonthlyPayment() {
        setAmount(getAmount()-getMonthlyPayment());
        setPeriod(getPeriod()-1);
    }
}
