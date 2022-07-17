package Person;

public class Demo {
    public static void main(String[] args) {
        Person[] group=new Person[10];
        group[0]=new Person("Mincho", (byte) 12, true);
        group[1]=new Person("Pencho", (byte) 19, true);
        group[2]=new Employee("Penka", (byte) 25, false, 100);
        group[3]=new Employee("Goshko", (byte) 35, true, 120);
        group[4]=new Student("Petio", (byte) 65, true, 3.4);
        group[5]=new Student("Stefka", (byte) 23, false, 5.99);


        for(int i=0;i<=5;i++){
            if(group[i].getClass()==Person.class){
                group[i].showPersonInfo();
            }
            else if(group[i].getClass()==Employee.class){
                ((Employee)group[i]).showEmployeeInfo();
            }
            else if(group[i].getClass()==Student.class){
                ((Student)group[i]).showStudentInfo();
            }
        }

        for(int i=0;i<=5;i++){
            if(group[i].getClass()==Employee.class){
                ((Employee)group[i]).calculateOvertime(2);
            }
        }

    }
}
