package court;

public abstract class Citizen extends Person{
    private String address;
    private byte age;

    public Citizen(String name, String address, byte age) {
        super(name);

        if (!(address==null || address.equals(""))){
            this.address = address;
        }else{
            this.address = "Default adress";
        }

        if (age<18){
            this.age = 18;
        }else{
            this.age = age;
        }

    }

    String answerQuestion(){
        int randomNumber =(int)(Math.random()*5);
        switch (randomNumber){
            case 0: return "Answer 1";
            case 1: return "Answer 2";
            case 2: return "Answer 3";
            case 3: return "Answer 4";
            case 4: return "Answer 5";
        }
        return "Generic answer";
    }
}
