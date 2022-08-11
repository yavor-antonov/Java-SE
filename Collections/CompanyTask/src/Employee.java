public class Employee {
    private String name;
    private int age;
    private float salary;
    private int idNumber;

    public Employee(String name, int age, float salary, int idNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", idNumber=" + idNumber +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof Employee)){
            return ((Employee) obj).salary == this.salary && ((Employee) obj).name == this.name;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * ((int)salary);
    }
}
