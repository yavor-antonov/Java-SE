package credits.bankProducts;

import bank.Client;
import credits.ConsumerCredit;
import credits.HomeCredit;
import deposits.LongDeposit;
import deposits.ShortDeposit;

public abstract class BankProduct {
    private final String productID;
    private float annualInterest;
    private int period;
    private float amount;
    private float monthlyPayment;
    private Client client;

    public BankProduct(float annualInterest, int period, float amount,Client client) {
        this.productID = generateProductID();
        setAnnualInterest(annualInterest);
        setPeriod(period);
        setAmount(amount);
        setClient(client);
        this.monthlyPayment = calculateMonthlyPayment();
    }

    public static Credit createCredit(String type, int period,float amount,Client client){
        if ((type == null) ||(period<=0)|| (amount<=0) ||(client== null)){
            return null;
        }
        if (type.toLowerCase().contains("home")){
            return new HomeCredit(period,amount,client);
        }
        if (type.toLowerCase().contains("consumer")){
            return new ConsumerCredit(period,amount,client);
        }
        return null;
    }
    public static Deposit createDeposit(String type,float amount,Client client){
        if ((type == null) || (amount<=0) ||(client== null)){
            return null;
        }
        if (type.toLowerCase().contains("short")){
            return new ShortDeposit(amount,client);
        }
        if (type.toLowerCase().contains("long")){
            return new LongDeposit(amount,client);
        }
        return null;
    }

    public String getProductID() {
        return productID;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public int getPeriod() {
        return period;
    }

    public float getAmount() {
        return amount;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setAnnualInterest(float annualInterest) {
        if (annualInterest<=0){
            System.out.println("Invalid interest rate");
        }else{
            this.annualInterest = annualInterest;
        }
    }

    void setPeriod(int period) {
        if (period>=1 && period<=60) {
            this.period = period;
        }else{
            System.out.println("Invalid period");
        }
    }

    void setClient(Client client) {
        if (client == null){
            System.out.println("Invalid client");
        }else{

        }this.client = client;

    }

    void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    void setAmount(float amount) {
        if (amount<=0){
            System.out.println("Invalid amount");
        }else{
            this.amount = amount;
        }
    }

    @Override
    public String toString() {
        return  "{ productID= " + productID +
                ", annualInterest=" + annualInterest +
                ", period=" + period +
                ", amount=" + amount + "$" +
                ", monthlyPayment=" + monthlyPayment + "$"+
                ", client=" + client.getName() +
                " }";
    }

    abstract float calculateMonthlyPayment();
    public abstract void makeMonthlyPayment();
    protected abstract String generateProductID();
}
