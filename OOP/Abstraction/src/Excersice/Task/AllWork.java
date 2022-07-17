package Excersice.Task;

class AllWork {
    private static final int MAXIMUM_NUMBER_OF_TASKS = 10;
    private Task [] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask; // индекса на текущата свободна задача по която няма работник които да работи

    public AllWork() {
        this.tasks = new Task [MAXIMUM_NUMBER_OF_TASKS];
        this.freePlacesForTasks = MAXIMUM_NUMBER_OF_TASKS;
        this.currentUnassignedTask = 0;
    }

    void addTask(Task task){
        if (task != null&&freePlacesForTasks>0){
            int indexOfFreePlaceForTasks = this.tasks.length-this.freePlacesForTasks;
            this.tasks[indexOfFreePlaceForTasks] = task;
            freePlacesForTasks--;
        }else{
            System.out.println("Cannot add Task!");
        }
    }

    Task getNextTask(){
        if (currentUnassignedTask>tasks.length-1){
            return null;
        }
        Task temp = this.tasks[this.currentUnassignedTask];
        currentUnassignedTask++;
        return temp;
    }

    boolean isAllWorkDone(){
        for (Task task:this.tasks) {
            if (task.getWorkingHours()>0){
                return false;
            }
        }
        return true;
    }
}
