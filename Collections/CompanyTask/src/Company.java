import java.util.*;

public class Company {
    private final String name;
    private Map<String,HashSet<Employee>> employeeList;

    private int idCounter = 0;


    public Company(String name) {
        this.name = name;
        this.employeeList = new HashMap<String, HashSet<Employee>>();
    }

    public void addEmployee(String department, String name, int age, float salary) throws CompanyException {
        if ((department != null) && (name != null) && (age >= 18) && (salary >0)) {
            Employee temp = new Employee(name, age, salary, idCounter);
            idCounter++;
            if (!employeeList.containsKey(department)) {
                employeeList.put(department, new HashSet<Employee>());
            }
            employeeList.get(department).add(temp);
        }else{
            throw new CompanyException("Cannot add employee");
        }
    }

    public void printEmployees(){
        for (String department : employeeList.keySet()){
            System.out.println(department);
            for (Employee employee : employeeList.get(department)){
                System.out.println(employee);
            }
        }

    }

    public SortedSet <Employee> getEmployees(String sortBy){
        Comparator<Employee> comparator= getComparatorBySortCriteria(sortBy);
        SortedSet<Employee> result = new TreeSet<Employee>(comparator);
        for (String department: employeeList.keySet()){
            result.addAll(employeeList.get(department));
        }
        return result;
    }

    public SortedSet <Employee> getEmployees(String department, Collection<Employee> listOfEmployees) throws CompanyException {
        if ((department != null) && (employeeList.containsKey(department)) ){
            SortedSet<Employee> result = new TreeSet<Employee>(new NameComparator());
            Set<Employee> employeesInDepartment = new HashSet<>(this.employeeList.get(department));
//            for (Employee employee : listOfEmployees){
//                if (employeesInDepartment.contains(employee)){
//                    result.add(employee);
//                }
//            }
            employeesInDepartment.retainAll(listOfEmployees);
//            listOfEmployees.retainAll(employeesInDepartment);
            result.addAll(employeesInDepartment);
            return result;
        }
        throw  new CompanyException("No such department");
    }


    private Comparator<Employee> getComparatorBySortCriteria (String sortBy){
        if (sortBy.toLowerCase().equals("name")){
            return new NameComparator();
        }
        if (sortBy.toLowerCase().equals("age")){
            return new AgeComparator();
        }
        if (sortBy.toLowerCase().equals("salary")){
            return new SalaryComparator();
        }
        return null;
    }



}
