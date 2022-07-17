package Person;

public class Student extends Person{
    private double score;


    public Student(String name, byte age, boolean isMale,double score) {
        super(name, age, isMale);
        setScore(score);
    }

    public void setScore(double score) {
        this.score = score;
    }

    void showStudentInfo (){
        showPersonInfo();
        System.out.println("Score: " +  this.score);
    }
}
