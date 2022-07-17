package Task;

public class Main {
    public static void main(String[] args) {
        Task game = new Task("D&D",3);
        Employee john = new Employee("Johny Bravo");
        john.setCurrentTask(game);
        john.setHoursLeft(8);
        john.work();
    }
}
