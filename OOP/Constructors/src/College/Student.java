package College;

public class Student {
    String name; // име на студента
    String subject; // специалност
    float grade; // успех
    byte yearInCollege; // курс
    int age; // години
    boolean isDegree; //Дали е завършил или не
    int money;

    Student(){
        this.grade = 4.0f;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money=0;
    }

    Student(String name, String subject) {
        this();
        this.name = name;
        this.subject = subject;
    }

    void upYear(){
        if (isDegree){
            System.out.println(this.name + " already graduated");
        }
        yearInCollege++;
        if (this.yearInCollege == 4){
            this.isDegree = true;
        }
    }

    double receiveScholarship(double min, double amount){
        if (amount<0 && min<0){
            return this.money;
        }
        if (this.grade>=min && this.age<30){
            return this.money+=amount;
        }
        return this.money;
    }


}
