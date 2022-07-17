package Excersice.Task;

class Employee {
    private static final int STARTING_DAY_HOURS_LEFT = 8;
    private String name;
    private Task currentTask;
    private int hoursLeft;

    static AllWork allwork;

    Employee(String name) {
        setName(name);
    }

    void work(){
        if (this.currentTask == null){

            this.currentTask = allwork.getNextTask();
            if (this.currentTask == null){
                System.out.println("No more tasks! " + this.name + " is resting!");
                return;
            }else{
            System.out.println(this.name + " started working on: "
                    + this.currentTask.getName());
            }
        }

        if(currentTask.getWorkingHours()>=this.hoursLeft){
            this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
            System.out.println(this.name + " worked " + this.hoursLeft +
                    " hours on: " + this.currentTask.getName());
            this.hoursLeft=0;

        }else{
            System.out.println(this.name + " worked " + this.currentTask.getWorkingHours()
                    +" hours and completed: " + this.currentTask.getName());
            this.hoursLeft-=this.currentTask.getWorkingHours();
            this.currentTask.setWorkingHours(0);
            this.currentTask=null;
            work();
        }
        //this.showReport();
    }

    void startWorkingDay(){
        System.out.println(this.name + ": New day has started");
        setHoursLeft(STARTING_DAY_HOURS_LEFT);
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        if (!(name == null || name.equals(""))) {
            this.name = name;
        }else{
            this.name = "Default name for Employee";
        }
    }

    Task getCurrentTask() {
        return currentTask;
    }

    void setCurrentTask(Task currentTask) {
        if (!currentTask.equals("")){
            this.currentTask = currentTask;
        }else{
            this.currentTask= null;
        }
    }

    int getHoursLeft() {
        return hoursLeft;
    }

    void setHoursLeft(int hoursLeft) {
        if (hoursLeft>=0){
            this.hoursLeft = hoursLeft;
        }
    }

    static AllWork getAllwork() {
        return allwork;
    }

    static void setAllwork(AllWork allwork) {
        Employee.allwork = allwork;
    }

    void showReport(){
        System.out.print("Employee name: " + this.name);
        System.out.print(" Current Task: " + this.currentTask.getName());
        System.out.print(" Hours left: " + this.hoursLeft);
        System.out.println(" Hours left to complete current Task: "
                + this.currentTask.getWorkingHours());
    }
}
