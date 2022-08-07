import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() == o2.getSalary()){
            return o1.getName().compareTo(o2.getName());
        }
        return (int) o1.getSalary()-(int)o2.getSalary();
    }
}
