package Person;

public class Person {
    private String name;
    private byte age;
    private boolean isMale;


    public Person(String name, byte age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    void showPersonInfo(){
        System.out.print("Name: " + this.name + " Age: " + this.age);
        if (isMale){
            System.out.println(" Gender: Male");
        }else{
            System.out.println(" Gender: Female");
        }
    }

    public byte getAge() {
        return age;
    }
}
