package College;

public class StudentGroup {
    String groupSubject;
    Student [] students;
    int freePlaces;

    public StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    public StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    void addStudent(Student s){
        if (s.subject.equals(this.groupSubject) && freePlaces>0){
            for (int index = 0; index<this.students.length; index++){
                if (this.students[index]==null){
                    this.students[index] = s;
                    freePlaces--;
                    return;
                }
            }
        }
    }

    void emptyGroup(){
        this.students = new Student[5];
    }

    String theBestStudent(){
        String bestStudent = this.students[0].name;
        for (int index = 1; index<this.students.length; index++){
            if (this.students[index]== null){
                continue;
            }
            if (this.students[index].grade > this.students[index-1].grade){
                bestStudent = this.students[index].name;
            }
        }
        return bestStudent;
    }

    void printStudentsInGroup(){
        for (int index = 0 ; index<this.students.length; index++) {
            if (this.students[index] == null) {
                continue;
            }
            System.out.print("Name: " + this.students[index].name + " ");
            System.out.print("Age: " + this.students[index].age + " ");
            System.out.print("Year: " + this.students[index].yearInCollege + " ");
            System.out.println("Grade: " + this.students[index].grade + " ");
        }
    }
}
