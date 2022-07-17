package College;

public class College {
    public static void main(String[] args) {
        Student john = new Student("John Deere", "Agriculture");
        Student martin = new Student("Martin King", "Agriculture");
        Student viki = new Student("Viktoria Green", "Agriculture");

        Student cory = new Student("Cory Blue", "Design");
        Student luke = new Student("Luke Skywalker", "Design");
        Student alice = new Student("Alice Sun", "Design");

        john.receiveScholarship(2,50);
        cory.receiveScholarship(5,20);

        StudentGroup agriculture = new StudentGroup("Agriculture");
        agriculture.addStudent(john);
        agriculture.addStudent(martin);
        agriculture.addStudent(cory);
        agriculture.addStudent(viki);

        martin.grade=5;
        viki.grade=3;

        System.out.println(agriculture.theBestStudent());
        agriculture.printStudentsInGroup();
        agriculture.emptyGroup();
        agriculture.printStudentsInGroup();
    }
}
