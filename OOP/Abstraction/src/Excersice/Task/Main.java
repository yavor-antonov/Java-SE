package Excersice.Task;

public class Main {
    public static void main(String[] args) {
        AllWork project = new AllWork();
        project.addTask(new Task("Warcraft",25));
        project.addTask(new Task("D&D",15));
        project.addTask(new Task("Lineage",37));
        project.addTask(new Task("Starcraft",12));
        project.addTask(new Task("Contra",7));
        project.addTask(new Task("Diablo",25));
        project.addTask(new Task("Age of Empires",21));
        project.addTask(new Task("Heroes",11));
        project.addTask(new Task("Total War",8));
        project.addTask(new Task("DotA",3));

        Employee john = new Employee("Johny Bravo");
        Employee ivan = new Employee("Ivan Ivanov");
        Employee kurt = new Employee("Kurt Russel");
        Employee rambo = new Employee("Rambo");

        Employee.setAllwork(project);
        int day=0;

        while(!project.isAllWorkDone()){
            day++;
            System.out.println("Day: " + day);
            System.out.println("-------------------------------------");
            john.startWorkingDay();
            ivan.startWorkingDay();
            kurt.startWorkingDay();
            rambo.startWorkingDay();

            john.work();
            ivan.work();
            kurt.work();
            rambo.work();
        }


//        john.setCurrentTask(game);
//        john.setHoursLeft(8);
//        john.work();
    }
}
