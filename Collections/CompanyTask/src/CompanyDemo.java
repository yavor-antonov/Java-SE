public class CompanyDemo {
    public static void main(String[] args) throws CompanyException {
        Company company = new Company("KBC");
        for (int i = 1; i<=9;i++){
            int age = 18 + (int)(Math.random()*15);
            float salary= 1200 + (int)(Math.random()*1000);

            String department = i%3==0 ? "IT" :
                         i%2 == 0 ? "Administration" : "Finance";

            company.addEmployee(department,"Employee: " + i,age,salary);
        }

        company.printEmployees();

        for (Employee employee : company.getEmployees("age")){
            System.out.println(employee.getName() + " Age:" + employee.getAge());
        }
    }
}
