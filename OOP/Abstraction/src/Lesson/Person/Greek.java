package Lesson.Person;

public class Greek  implements IWorker,ITaxPayer,IHusband{
    @Override
    public void buyFlowersForWife() {
        System.out.println("Buys 5 flowers for wife");
    }

    @Override
    public void payTax() {
        System.out.println("Pays half of his taxes");
    }

    @Override
    public void goToWork() {
        System.out.println("Doesn't want to work");
    }
}
