package court;

public abstract class Person {
    public String name;

    public Person(String name) {
        if (!(name==null || name.equals(""))){
            this.name = name;
        }else{
            this.name = "Default name";
        }
    }
}
