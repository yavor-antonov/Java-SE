package Task;

public class Employee {
    String name;
    Task currentTask;
    int hoursLeft;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null)&&name.equals("")){
            return;
        }
        this.name = name;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        if (currentTask.equals(null)&&currentTask.equals("")){
            return;
        }
        this.currentTask = currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft<=0){
            return;
        }
        this.hoursLeft = hoursLeft;
    }

    void work(){
        this.currentTask.workingHours -=this.hoursLeft;
        this.hoursLeft =0;
        if (this.currentTask.workingHours<0){
            this.hoursLeft -= this.currentTask.workingHours;
            this.currentTask.workingHours = 0;
        }
        this.showReport();
    }

    void showReport(){
        System.out.print("Employee name: " + this.name);
        System.out.print(" Current Task: " + this.currentTask.name);
        System.out.print(" Hours left: " + this.hoursLeft);
        System.out.println(" Hours left to complete current Task: " + this.currentTask.workingHours);
    }
}
