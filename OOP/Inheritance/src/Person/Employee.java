package Person;

public class Employee extends Person{
    private double daySalary;

    public Employee(String name, byte age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours){
        if (getAge()<18){
            return 0;
        }

        return daySalary*1.5;
    }

    void showEmployeeInfo(){
        showPersonInfo();
        System.out.println("Day salary: " +  this.daySalary);
    }
}
