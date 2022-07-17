package Lesson.Person;

public class German implements IWorker,ITaxPayer,IHusband{
    @Override
    public void buyFlowersForWife() {
        System.out.println("Buys 1 flowers for wife");
    }

    @Override
    public void payTax() {
        System.out.println("Pays all his taxes");
    }

    @Override
    public void goToWork() {
        System.out.println("Works hard");
    }
}
