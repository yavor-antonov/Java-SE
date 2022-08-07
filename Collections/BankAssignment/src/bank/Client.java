package bank;

import credits.bankProducts.Credit;
import credits.bankProducts.Deposit;
import interfaces.IClient;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Client implements IClient {
    private final String name;
    private String address;
    private float money;
    private float salary;
    private List<Deposit> depositList;
    private List<Credit> creditList;

    public Client(String name, String address, float money, float salary) {
        this.name = name;
        this.address = address;
        this.money = money;
        this.salary = salary;
        this.depositList = new LinkedList<Deposit>();
        this.creditList = new LinkedList<Credit>();
    }

    @Override
    public void openDeposit(float amount,String type,Bank bank) {
        if (bank == null){
            System.out.println("invalid bank");
            return;
        }
        if (amount> this.money || amount<=0){
            System.out.println(this.name + ": Not enough money to open deposit");
            return;
        }

        Deposit newDeposit = bank.receiveDeposit(type,amount,this);
        if (newDeposit != null){
            this.money-=amount;
            this.depositList.add(newDeposit);
        }


    }

    @Override
    public void requestCredit(float amount, String type, Bank bank, int period) {
        if ((type == null) || (amount<=0) || (period<=0)||(bank== null)){
            return ;
        }
        Credit newCredit = bank.giveCredit(type,amount,period,this);
        if (newCredit == null){
            return;
        }
        this.money+= newCredit.getAmount();
        creditList.add(newCredit);
    }

    @Override
    public void payCredit(Bank bank) {
        for (Credit credit : creditList){
            this.money-=credit.getAmount();
            credit.makeMonthlyPayment();
        }

    }

    public String getName() {
        return name;
    }

    public float getMoney() {
        return money;
    }

    public float getSalary() {
        return salary;
    }

    public List<Credit> getCreditList() {
        return Collections.unmodifiableList(creditList);
    }
    private String printCreditList(){
        StringBuilder s = new StringBuilder();
        s.append("============Credits============\n");
        for (Credit credit : creditList){
            s.append(credit).append("\n");
        }
        return s.toString();
    }
    private String printDepositList(){
        StringBuilder s = new StringBuilder();
        s.append("============Deposits============\n");
        for (Deposit deposit : depositList){
            s.append(deposit).append("\n");
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money + "$" +
                ", salary=" + salary + "$\n" +
                printDepositList() +
                printCreditList();
    }
}
