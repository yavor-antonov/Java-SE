package bank;

import bankProducts.BankProduct;
import bankProducts.Credit;
import bankProducts.Deposit;
import interfaces.IBank;


import java.util.LinkedList;
import java.util.List;


public class Bank implements IBank {
    private final String name;
    private String address;
    private List<BankProduct> bankProductList;
    private float liquidity;
    private float bankReserve;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.bankProductList = new LinkedList<BankProduct>();
        this.liquidity = 0;
        this.bankReserve = 0;
    }

    @Override
    public Deposit receiveDeposit(String type,float amount,Client client) {
        if ((type == null) || (amount<=0) ||(client== null)){
            return null;
        }
        Deposit newDeposit = BankProduct.createDeposit(type,amount,client);
        if (newDeposit==null){
            return null;
        }
        this.liquidity+= newDeposit.getAmount() * 0.9;
        this.bankReserve+= newDeposit.getAmount() * 0.1;
        this.bankProductList.add(newDeposit);
        return newDeposit;
    }

    @Override
    public void payInterest() {
        for (BankProduct deposit : bankProductList){
            if (deposit instanceof Deposit){
                this.liquidity -= 0.1 * deposit.getMonthlyPayment();
                this.bankReserve += 0.1 * deposit.getMonthlyPayment();
                deposit.makeMonthlyPayment();
            }
        }
    }

    @Override
    public Credit giveCredit(String type, float amount, int period, Client client) {
        if ((type == null) || (amount<=0) || (period<=0)||(client== null)){
            return null;
        }

        float totalCredits = 0;
        for (Credit credit: client.getCreditList()){
            totalCredits +=credit.getMonthlyPayment();
        }
        if (client.getSalary()/2 <= totalCredits){
            System.out.println("Salary is too small");
            return null;
        }

        if (amount>liquidity){
            System.out.println("Not enough liquidity");
            return null;
        }

        Credit newCredit = BankProduct.createCredit(type, period, amount, client);
        if (newCredit == null){
            return null;
        }
        this.liquidity-=amount;
        bankProductList.add(newCredit);
        return newCredit;
    }

    private String printBankProductList(){
        StringBuilder s = new StringBuilder();
        s.append("============Deposits============\n");
        for (BankProduct bankProduct : bankProductList){
            if (bankProduct instanceof Deposit) {
                s.append(bankProduct).append("\n");
            }
        }
        s.append("============Credits============\n");
        for (BankProduct bankProduct : bankProductList){
            if (bankProduct instanceof Credit) {
                s.append(bankProduct).append("\n");
            }
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return "Bank= " + name +
                ", address= " + address +
                ", liquidity=" + liquidity + "$" +
                ", bankReserve=" + bankReserve + "$" +
                "\n" + printBankProductList();
    }
}
