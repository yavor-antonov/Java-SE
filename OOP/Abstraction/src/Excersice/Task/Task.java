package Excersice.Task;

class Task {
    private String name;
    private int workingHours;

    public Task(String name, int workingHours) {
        setName(name);
        setWorkingHours(workingHours);
    }

    String getName() {
        return name;
    }

    private void setName(String name) {
        if (!(name == null || name.equals(""))) {
            this.name = name;
        }else{
            this.name = "Default name for Task";
        }
    }

    int getWorkingHours() {
        return workingHours;
    }

    void setWorkingHours(int workingHours) {
        if (workingHours>=0) {
            this.workingHours = workingHours;
        }
    }
}
