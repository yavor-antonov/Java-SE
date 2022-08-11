import java.util.Arrays;
import java.util.SortedSet;

public class CompanyDemo {
    public static void main(String[] args) throws CompanyException {
        Company company = new Company("KBC");
        try{
            for (int i = 1; i<=9;i++){
                int age = 18 + (int)(Math.random()*15);
                float salary= 1200 + (int)(Math.random()*1000);

                String department = i%3==0 ? "IT" :
                        i%2 == 0 ? "Administration" : "Finance";

                company.addEmployee(department,"Employee: " + i,age,salary);
            }
            company.addEmployee("Finance","John",25,1200);
            company.addEmployee("Finance","George",25,1200);
            company.addEmployee("Finance","Rowan",25,1200);

//            company.printEmployees();

//            for (Employee employee : company.getEmployees("age")){
//                System.out.println(employee.getName() + " Age:" + employee.getAge());
//            }

            SortedSet<Employee> employees = company.getEmployees("Finance",Arrays.asList(
                    new Employee("John",25,1200,250),
                    new Employee("Bobby",25,1200,250),
                    new Employee("Rowan",25,1200,250)));
            for (Employee employee : employees){
                System.out.println(employee);
            }
        }catch (CompanyException e){
            e.printStackTrace();
        }



    }
}
