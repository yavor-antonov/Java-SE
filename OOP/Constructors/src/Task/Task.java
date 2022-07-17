package Task;

public class Task {
    String name;
    int workingHours;

    public Task(String name, int workingHours) {
        this.name = name;
        if (workingHours>0) {
            this.workingHours = workingHours;
        }else{
            this.workingHours = workingHours;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
