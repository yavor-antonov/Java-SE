package Lesson.Person;

public class Bulgarian implements IWorker,ITaxPayer,IHusband{
    @Override
    public void buyFlowersForWife() {
        System.out.println("Buys 3 flowers for wife");
    }

    @Override
    public void payTax() {
        System.out.println("Doesn't pay taxes");
    }

    @Override
    public void goToWork() {
        System.out.println("Works very slow");
    }
}
